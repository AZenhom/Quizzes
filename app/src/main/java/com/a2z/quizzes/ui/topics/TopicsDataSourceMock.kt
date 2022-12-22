package com.a2z.quizzes.ui.topics

import com.a2z.quizzes.model.TopicModel

class TopicsDataSourceMock {
    private val allTopics = listOf(
        // Grade 1 Topics
        TopicModel("gd1_en", "English", "topic_english", 1),
        TopicModel("gd1_mth", "Mathematics", "topic_math", 1),
        // Grade 2 Topics
        TopicModel("gd2_en", "English", "topic_english", 2),
        TopicModel("gd2_mth", "Mathematics", "topic_math", 2),
        TopicModel("gd2_bi", "Biology Discovery", "topic_biology", 2),
        // Grade 3 Topics
        TopicModel("gd3_en", "English", "topic_english", 3),
        TopicModel("gd3_mth", "Mathematics", "topic_math", 3),
        TopicModel("gd3_bi", "Biology Introduction", "topic_biology", 3),
        TopicModel("gd3_ch", "Chemistry Introduction", "topic_chemistry", 3),
        TopicModel("gd3_hi", "History Novels", "topic_history", 3),
        TopicModel("gd3_phy", "Physics Experiments", "topic_physics", 3),
        // Grade 4 Topics
        TopicModel("gd4_en", "English", "topic_english", 4),
        TopicModel("gd4_mth", "Mathematics", "topic_math", 4),
        TopicModel("gd4_bi", "Biology", "topic_biology", 4),
        TopicModel("gd4_ch", "Chemistry", "topic_chemistry", 4),
        TopicModel("gd4_hi", "History", "topic_history", 4),
        TopicModel("gd4_phy", "Physics Introduction", "topic_physics", 4),
        // Grade 5 Topics
        TopicModel("gd5_en", "English", "topic_english", 5),
        TopicModel("gd5_mth", "Mathematics", "topic_math", 5),
        TopicModel("gd5_bi", "Biology", "topic_biology", 5),
        TopicModel("gd5_ch", "Chemistry", "topic_chemistry", 5),
        TopicModel("gd5_hi", "History", "topic_history", 5),
        TopicModel("gd5_phy", "Physics", "topic_physics", 5),
        // Grade 6 Topics
        TopicModel("gd6_en", "English", "topic_english", 6),
        TopicModel("gd6_mth", "Mathematics", "topic_math", 6),
        TopicModel("gd6_bi", "Biology", "topic_biology", 6),
        TopicModel("gd6_ch", "Chemistry", "topic_chemistry", 6),
        TopicModel("gd6_hi", "History", "topic_history", 6),
        TopicModel("gd6_phy", "Physics", "topic_physics", 6),
    )

    fun getAllTopics() = allTopics

    fun getGradeTopics(gradeId: Int?) = allTopics.filter { it.gradeId == gradeId }
}