package com.a2z.quizzes.model

import java.io.Serializable

data class ExamModel(
    val id: String? = null,
    val name: String? = null,
    val percentageToPass: Int? = null,
    val questionsList: List<QuestionModel>? = null,
    val topicId: String? = null,
    var status: ExamStatus? = null
) : Serializable

enum class ExamStatus(val value: Int) {
    NOT_TAKEN(0),
    PASSED(1),
    FAILED(-1);

    companion object {
        fun fromInt(value: Int) = values().first { it.value == value }
    }
}
