package com.a2z.quizzes.ui.grades

import android.content.Context
import android.content.Intent
import com.a2z.quizzes.core.BaseActivity
import com.a2z.quizzes.databinding.ActivityGradesBinding
import com.a2z.quizzes.model.GradeModel
import com.a2z.quizzes.ui.topics.TopicsActivity

class GradesActivity : BaseActivity<ActivityGradesBinding>() {

    companion object {
        fun getIntent(context: Context) = Intent(context, GradesActivity::class.java)
    }

    override val binding by viewBinding(ActivityGradesBinding::inflate)

    lateinit var adapter: GradesAdapter

    override fun onActivityCreated() {
        doubleBackToExitPressedOnce = false
        registerToolBarOnBackPressed(binding.toolbar)
        adapter = GradesAdapter { openTopicsActivity(it) }
        binding.rvGrades.adapter = adapter
        getData()
    }

    private fun getData() {

    }

    private fun openTopicsActivity(selectedGrade: GradeModel) {
        startActivity(TopicsActivity.getIntent(this, selectedGrade))
    }
}