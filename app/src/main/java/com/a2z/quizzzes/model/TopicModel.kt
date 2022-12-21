package com.a2z.quizzzes.model

import java.io.Serializable

data class TopicModel(
    val id: String? = null,
    val name: String? = null,
    val resName: String? = null,
    val gradeId: String? = null,
) : Serializable
