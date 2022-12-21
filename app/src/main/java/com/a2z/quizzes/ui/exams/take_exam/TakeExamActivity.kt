package com.a2z.quizzes.ui.exams.take_exam

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import com.a2z.quizzes.R
import com.a2z.quizzes.core.BaseActivity
import com.a2z.quizzes.databinding.ActivityTakeExamBinding
import com.a2z.quizzes.model.ExamModel
import com.a2z.quizzes.model.QuestionModel

class TakeExamActivity : BaseActivity<ActivityTakeExamBinding>() {

    companion object {
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
    private var currentQuestionNo: Int = 0
    private var currentAnswerNo: Int = 0
    private var currentScore: Int = 0
    private lateinit var currentQuestion: QuestionModel
    private lateinit var questionsList: List<QuestionModel>

    override fun onActivityCreated() {
        registerToolBarOnBackPressed(binding.toolbar)
        if (getData()) {
            initUI()
            fetchCurrentQuestion()
        }
    }

    private fun getData(): Boolean {
        if (questionsList.isEmpty())
            finish()
        return questionsList.isNotEmpty()
    }

    private fun initUI() = with(binding) {
        rbAnswer1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) onAnswerChecked(1)
        }
        rbAnswer2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) onAnswerChecked(2)
        }
        rbAnswer3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) onAnswerChecked(3)
        }
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
        when (answerNo) {
            1 -> {
                binding.rbAnswer2.isChecked = false
                binding.rbAnswer3.isChecked = false
            }
            2 -> {
                binding.rbAnswer1.isChecked = false
                binding.rbAnswer3.isChecked = false
            }
            3 -> {
                binding.rbAnswer1.isChecked = false
                binding.rbAnswer2.isChecked = false
            }
            else -> Unit
        }
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
        if (finalScore >= (currentExam.percentageToPass ?: return))
            showSuccessMsg("${getString(R.string.exam_passed_with_score)}: ${finalScore.toInt()}")
        else
            showSuccessMsg("${getString(R.string.exam_failed_with_score)}: ${currentExam.percentageToPass}")
        finish()

    }

}