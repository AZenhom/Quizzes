package com.a2z.quizzes.ui.topics

import android.content.Context
import android.content.Intent
import com.a2z.quizzes.core.BaseActivity
import com.a2z.quizzes.databinding.ActivityTopicsBinding
import com.a2z.quizzes.model.GradeModel
import com.a2z.quizzes.model.TopicModel
import com.a2z.quizzes.ui.exams.exams_list.ExamsActivity

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

    private lateinit var adapter: TopicsAdapter

    override fun onActivityCreated() {
        registerToolBarOnBackPressed(binding.toolbar)
        adapter = TopicsAdapter { openExamsActivity(it) }
        binding.rvTopics.adapter = adapter
        getData()
    }

    private fun getData() {
        val currentGrade = intent.getSerializableExtra(GRADE_MODEL) as GradeModel?
        val gradeTopics = TopicsDataSourceMock().getGradeTopics(currentGrade?.id)
        adapter.submitList(gradeTopics)
    }

    private fun openExamsActivity(selectedTopic: TopicModel) {
        startActivity(ExamsActivity.getIntent(this, selectedTopic))
    }

}