package com.a2z.quizzes.model

import java.io.Serializable

data class TopicModel(
    val id: String? = null,
    val name: String? = null,
    val resName: String? = null,
    val gradeId: Int? = null,
) : Serializable
