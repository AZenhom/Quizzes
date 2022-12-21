package com.a2z.quizzzes.model

import java.io.Serializable

data class QuestionModel(
    val id: String? = null,
    val questionText: String? = null,
    val mcq1: String? = null,
    val mcq2: String? = null,
    val mcq3: String? = null,
    val rightAnswer: Int? = null
) : Serializable
