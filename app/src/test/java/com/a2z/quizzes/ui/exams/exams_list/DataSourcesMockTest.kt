package com.a2z.quizzes.ui.exams.exams_list

import com.a2z.quizzes.ui.grades.GradesDataSourceMock
import com.a2z.quizzes.ui.topics.TopicsDataSourceMock
import org.junit.Test

internal class DataSourcesMockTest {
    private val gradesDataSourceMock = GradesDataSourceMock()
    private val topicsDataSourceMock = TopicsDataSourceMock()
    private val examsDataSourceMock = ExamsDataSourceMock(null)

    @Test
    fun `All Grades Should Hava Uniques IDs`() {
        val grades = gradesDataSourceMock.getAllGrades()
        val distinctGrades = grades.distinctBy { it.id }
        assert(grades.isNotEmpty() && grades.size == distinctGrades.size)
    }

    @Test
    fun `All Topics Should Hava Uniques IDs`() {
        val topics = topicsDataSourceMock.getAllTopics()
        val distinctTopics = topics.distinctBy { it.id }
        assert(topics.isNotEmpty() && topics.size == distinctTopics.size)
    }

    @Test
    fun `All Exams Should Hava Uniques IDs`() {
        val exams = examsDataSourceMock.getAllExams()
        val distinctExams = exams.distinctBy { it.id }
        assert(exams.isNotEmpty() && exams.size == distinctExams.size)
    }

    @Test
    fun `All Topics Should Have Exams`() {
        val topics = topicsDataSourceMock.getAllTopics()
        assert(topics.all { examsDataSourceMock.getExams(it.id).isNotEmpty() })
    }
}