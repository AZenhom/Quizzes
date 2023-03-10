package com.a2z.quizzes.ui.exams.exams_list

import android.content.Context
import android.content.Intent
import com.a2z.quizzes.core.BaseActivity
import com.a2z.quizzes.databinding.ActivityExamsBinding
import com.a2z.quizzes.model.ExamModel
import com.a2z.quizzes.model.TopicModel
import com.a2z.quizzes.ui.exams.take_exam.TakeExamActivity

class ExamsActivity : BaseActivity<ActivityExamsBinding>() {

    companion object {
        private const val TOPIC_MODEL = "TOPIC_MODEL"
        fun getIntent(
            context: Context,
            topicModel: TopicModel
        ) = Intent(context, ExamsActivity::class.java).apply {
            putExtra(TOPIC_MODEL, topicModel)
        }
    }

    override val binding by viewBinding(ActivityExamsBinding::inflate)

    private lateinit var adapter: ExamsAdapter
    private lateinit var examsDataSourceMock: ExamsDataSourceMock

    override fun onActivityCreated() {
        examsDataSourceMock = ExamsDataSourceMock(this)
        registerToolBarOnBackPressed(binding.toolbar)
        adapter = ExamsAdapter { openTakeExamActivity(it) }
        binding.rvExams.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    private fun getData() {
        val topicModel = intent.getSerializableExtra(TOPIC_MODEL) as TopicModel
        val exams = examsDataSourceMock.getExams(topicModel.id)
        adapter.submitList(exams)
    }

    private fun openTakeExamActivity(selectedExam: ExamModel) {
        startActivity(TakeExamActivity.getIntent(this, selectedExam))
    }
}