package com.a2z.quizzzes.ui.topics

import android.content.Context
import android.content.Intent
import com.a2z.quizzzes.core.BaseActivity
import com.a2z.quizzzes.databinding.ActivityTopicsBinding
import com.a2z.quizzzes.model.GradeModel
import com.a2z.quizzzes.model.TopicModel
import com.a2z.quizzzes.ui.exams.exams_list.ExamsActivity

class TopicsActivity : BaseActivity<ActivityTopicsBinding>() {

    companion object {
        private const val GRADE_MODEL = "GRADE_MODEL"
        fun getIntent(
            context: Context,
            gradeModel: GradeModel
        ) = Intent(context, TopicsActivity::class.java).apply {
            putExtra(GRADE_MODEL, gradeModel)
        }
    }

    override val binding by viewBinding(ActivityTopicsBinding::inflate)

    lateinit var adapter: TopicsAdapter

    override fun onActivityCreated() {
        registerToolBarOnBackPressed(binding.toolbar)
        adapter = TopicsAdapter { openExamsActivity(it) }
        binding.rvTopics.adapter = adapter
        getData()
    }

    private fun getData() {
    }

    private fun openExamsActivity(selectedTopic: TopicModel) {
        startActivity(ExamsActivity.getIntent(this, selectedTopic))
    }

}