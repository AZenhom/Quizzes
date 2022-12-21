package com.a2z.quizzzes.model

import java.io.Serializable

data class ExamModel(
    val id: String? = null,
    val name: String? = null,
    val percentageToPass: Float? = null,
    val questionsList: List<QuestionModel>? = null,
    val topicId: String? = null,
    var status: ExamStatus? = null
) : Serializable

enum class ExamStatus {
    NOT_TAKEN,
    PASSED,
    FAILED
}
