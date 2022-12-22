package com.a2z.quizzes.ui.grades

import com.a2z.quizzes.model.GradeModel

class GradesDataSourceMock {

    fun getAllGrades() = listOf(
        GradeModel(1, "Primary One"),
        GradeModel(2, "Primary Two"),
        GradeModel(3, "Primary Three"),
        GradeModel(4, "Primary Four"),
        GradeModel(5, "Primary Five"),
        GradeModel(6, "Primary Six"),
    )
}