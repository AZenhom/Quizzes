package com.a2z.quizzes.ui.exams.take_exam

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import com.a2z.quizzes.R
import com.a2z.quizzes.core.BaseActivity
import com.a2z.quizzes.databinding.ActivityTakeExamBinding
import com.a2z.quizzes.model.ExamModel
import com.a2z.quizzes.model.ExamStatus
import com.a2z.quizzes.model.QuestionModel

class TakeExamActivity : BaseActivity<ActivityTakeExamBinding>() {

    companion object {
        const val EXAMS_PREFERENCES = "EXAMS_PREFERENCES"
        private const val EXAM_MODEL = "EXAM_MODEL"
        fun getIntent(
            context: Context,
            examModel: ExamModel
        ) = Intent(context, TakeExamActivity::class.java).apply {
            putExtra(EXAM_MODEL, examModel)
        }
    }

    override val binding by viewBinding(ActivityTakeExamBinding::inflate)

    private lateinit var currentExam: ExamModel
    private lateinit var questionsList: List<QuestionModel>

    private var currentQuestionNo: Int = 0
    private var currentAnswerNo: Int = 0
    private var currentScore: Int = 0
    private lateinit var currentQuestion: QuestionModel

    private lateinit var sharedPreference: SharedPreferences

    override fun onActivityCreated() {
        sharedPreference = getSharedPreferences(EXAMS_PREFERENCES, Context.MODE_PRIVATE)
        registerToolBarOnBackPressed(binding.toolbar)
        if (getData()) {
            initUI()
            fetchCurrentQuestion()
        }
    }

    private fun getData(): Boolean {
        currentExam = intent.getSerializableExtra(EXAM_MODEL) as ExamModel? ?: ExamModel()
        questionsList = currentExam.questionsList ?: listOf()

        if (questionsList.isEmpty())
            finish()
        return questionsList.isNotEmpty()
    }

    private fun initUI() = with(binding) {
        rbAnswer1.isEnabled = false
        rbAnswer2.isEnabled = false
        rbAnswer3.isEnabled = false
        clAnswer1.setOnClickListener { onAnswerChecked(1) }
        clAnswer2.setOnClickListener { onAnswerChecked(2) }
        clAnswer3.setOnClickListener { onAnswerChecked(3) }

        btnNextQuestion.setOnClickListener {
            if (currentAnswerNo == 0) {
                showWarningMsg(getString(R.string.choose_answer_first))
                return@setOnClickListener
            }
            if (currentAnswerNo == currentQuestion.rightAnswer)
                currentScore++
            if (currentQuestionNo == questionsList.size - 1)
                finishExam()
            else {
                currentQuestionNo++
                fetchCurrentQuestion()
            }
        }
    }

    private fun onAnswerChecked(answerNo: Int) {
        currentAnswerNo = answerNo
        binding.rbAnswer1.isChecked = answerNo == 1
        binding.rbAnswer2.isChecked = answerNo == 2
        binding.rbAnswer3.isChecked = answerNo == 3
    }

    @SuppressLint("SetTextI18n")
    private fun fetchCurrentQuestion() {
        currentAnswerNo = 0
        currentQuestion = questionsList[currentQuestionNo]
        with(binding) {
            rbAnswer1.isChecked = false
            rbAnswer2.isChecked = false
            rbAnswer3.isChecked = false

            tvProgress.text = "${currentQuestionNo + 1}/${questionsList.size}"
            tvQuestion.text = currentQuestion.questionText

            tvAnswer1.text = currentQuestion.mcq1
            tvAnswer2.text = currentQuestion.mcq2
            tvAnswer3.text = currentQuestion.mcq3

            if (currentQuestionNo == questionsList.size - 1)
                btnNextQuestion.text = getString(R.string.finish_exam)
        }
    }

    private fun finishExam() {
        val finalScore = (currentScore.toFloat() / questionsList.size.toFloat()) * 100F
        val editor = sharedPreference.edit()
        if (finalScore >= (currentExam.percentageToPass?.toFloat() ?: return)) {
            editor.putInt(currentExam.id, ExamStatus.PASSED.value)
            showSuccessMsg("${getString(R.string.exam_passed_with_score)}: ${finalScore.toInt()}")
        } else {
            editor.putInt(currentExam.id, ExamStatus.FAILED.value)
            showErrorMsg("${getString(R.string.exam_failed_with_score)}: ${currentExam.percentageToPass}")
        }
        editor.apply()
        finish()

    }

}