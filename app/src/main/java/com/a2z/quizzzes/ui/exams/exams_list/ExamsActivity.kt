package com.a2z.quizzzes.ui.exams.exams_list

import android.content.Context
import android.content.Intent
import com.a2z.quizzzes.core.BaseActivity
import com.a2z.quizzzes.databinding.ActivityExamsBinding
import com.a2z.quizzzes.model.ExamModel
import com.a2z.quizzzes.model.TopicModel
import com.a2z.quizzzes.ui.exams.take_exam.TakeExamActivity

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

    override fun onActivityCreated() {
        registerToolBarOnBackPressed(binding.toolbar)
        adapter = ExamsAdapter { openTakeExamActivity(it) }
        binding.rvExams.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    private fun getData() {
    }

    private fun openTakeExamActivity(selectedExam: ExamModel) {
        startActivity(TakeExamActivity.getIntent(this, selectedExam))
    }
}