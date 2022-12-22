package com.a2z.quizzes.ui.exams.exams_list

import android.content.Context
import com.a2z.quizzes.model.ExamModel
import com.a2z.quizzes.model.ExamStatus
import com.a2z.quizzes.model.QuestionModel
import com.a2z.quizzes.ui.exams.take_exam.TakeExamActivity

class ExamsDataSourceMock(context: Context?) {

    private val sharedPreference =
        context?.getSharedPreferences(TakeExamActivity.EXAMS_PREFERENCES, Context.MODE_PRIVATE)

    private val exams = listOf(
        // English Exams
        ExamModel(
            id = "gd1_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd1_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I come ..... Italy.",
                    mcq1 = "to",
                    mcq2 = "from",
                    mcq3 = "at",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Ann, how are you?",
                    mcq1 = "I'm a nurse.",
                    mcq2 = "I'm fine, thanks. And you?",
                    mcq3 = "I am working",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd1_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd1_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd2_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd2_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd2_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd2_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I can't find my glasses. Can you look for.., please?",
                    mcq1 = "it",
                    mcq2 = "at",
                    mcq3 = "then",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = ".... there any cars on the street?",
                    mcq1 = "are",
                    mcq2 = "is",
                    mcq3 = "am",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = ".... do you go to the gym?",
                    mcq1 = "How long",
                    mcq2 = " How often",
                    mcq3 = "what",
                    rightAnswer = 2
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd3_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I come ..... Italy.",
                    mcq1 = "to",
                    mcq2 = "from",
                    mcq3 = "at",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Ann, how are you?",
                    mcq1 = "I'm a nurse.",
                    mcq2 = "I'm fine, thanks. And you?",
                    mcq3 = "I am working",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd3_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd3_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd4_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I can't find my glasses. Can you look for.., please?",
                    mcq1 = "it",
                    mcq2 = "at",
                    mcq3 = "then",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = ".... there any cars on the street?",
                    mcq1 = "are",
                    mcq2 = "is",
                    mcq3 = "am",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = ".... do you go to the gym?",
                    mcq1 = "How long",
                    mcq2 = " How often",
                    mcq3 = "what",
                    rightAnswer = 2
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I come ..... Italy.",
                    mcq1 = "to",
                    mcq2 = "from",
                    mcq3 = "at",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Ann, how are you?",
                    mcq1 = "I'm a nurse.",
                    mcq2 = "I'm fine, thanks. And you?",
                    mcq3 = "I am working",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd5_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_en_ex1",
            name = "English Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "His office is on the first ......",
                    mcq1 = "level",
                    mcq2 = "ground",
                    mcq3 = "floor",
                    rightAnswer = 3
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "I speak Hebrew and French but Ann ....",
                    mcq1 = "don't ",
                    mcq2 = "doesn't",
                    mcq3 = "Haven't",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Whose key is that? ",
                    mcq1 = "It's of Cate.",
                    mcq2 = " It's Cate.",
                    mcq3 = "It's Cate's.",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_en_ex2",
            name = "English Midterm 2 2022",
            percentageToPass = 50,
            topicId = "gd6_en",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "I can't find my glasses. Can you look for.., please?",
                    mcq1 = "it",
                    mcq2 = "at",
                    mcq3 = "then",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = ".... there any cars on the street?",
                    mcq1 = "are",
                    mcq2 = "is",
                    mcq3 = "am",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = ".... do you go to the gym?",
                    mcq1 = "How long",
                    mcq2 = " How often",
                    mcq3 = "what",
                    rightAnswer = 2
                ),
            ).shuffled()
        ),

        // Math Exams
        ExamModel(
            id = "gd1_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd1_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "1 + 7 =",
                    mcq1 = "4",
                    mcq2 = "8",
                    mcq3 = "9",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "3 - 2 =",
                    mcq1 = "1",
                    mcq2 = "11",
                    mcq3 = "0",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "11 - 1 =",
                    mcq1 = "3",
                    mcq2 = "4",
                    mcq3 = "10",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd2_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd2_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "5 x 20 =",
                    mcq1 = "200",
                    mcq2 = "100",
                    mcq3 = "40",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "6 / 3 =",
                    mcq1 = "2",
                    mcq2 = "1",
                    mcq3 = "4",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "88 / 11 =",
                    mcq1 = "77",
                    mcq2 = "7",
                    mcq3 = "8",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd3_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "The number of 3-digit numbers divisible by 3, is",
                    mcq1 = "123",
                    mcq2 = "436",
                    mcq3 = "670",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "6 / 3 + 20 =",
                    mcq1 = "22",
                    mcq2 = "17",
                    mcq3 = "4",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is 1004 divided by 2",
                    mcq1 = "202",
                    mcq2 = "504",
                    mcq3 = "502",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "The number of 3-digit numbers divisible by 3, is",
                    mcq1 = "123",
                    mcq2 = "436",
                    mcq3 = "670",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "9 / 3 + 20 =",
                    mcq1 = "23",
                    mcq2 = "17",
                    mcq3 = "4",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is 5004 divided by 2",
                    mcq1 = "2202",
                    mcq2 = "2504",
                    mcq3 = "2502",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "06 × 106 – 94 × 94",
                    mcq1 = "2400",
                    mcq2 = "4200",
                    mcq3 = "327",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "83 × 82 × 8-5",
                    mcq1 = "0",
                    mcq2 = "1",
                    mcq3 = "8",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "The simplest form of 1.5 : 2.5",
                    mcq1 = "2 : 10",
                    mcq2 = "2.5 : 8",
                    mcq3 = "3 : 5",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_mth_ex1",
            name = "Math Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_mth",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "06 × 106 – 94 × 94",
                    mcq1 = "2400",
                    mcq2 = "4200",
                    mcq3 = "327",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "83 × 82 × 8-5",
                    mcq1 = "0",
                    mcq2 = "1",
                    mcq3 = "8",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "The simplest form of 1.5 : 2.5",
                    mcq1 = "2 : 10",
                    mcq2 = "2.5 : 8",
                    mcq3 = "3 : 5",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        // Biology Exams
        ExamModel(
            id = "gd2_bi_ex1",
            name = "Biology Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd2_bi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "A person who studies biology is known as a?",
                    mcq1 = "Biologist",
                    mcq2 = "Zoo-ist",
                    mcq3 = "Chemist",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Can frogs live in salt water?",
                    mcq1 = "Yes",
                    mcq2 = "No",
                    mcq3 = "Maybe",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "The common cold is caused by a virus.",
                    mcq1 = "Maybe",
                    mcq2 = "No",
                    mcq3 = "Yes",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd3_bi_ex1",
            name = "Biology Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_bi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "A single piece of coiled DNA is known as a?",
                    mcq1 = "Chromosome",
                    mcq2 = "DNS",
                    mcq3 = "Cockroach",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "The area of biology of studying fungi is known as?",
                    mcq1 = "Zoology",
                    mcq2 = "Mycology",
                    mcq3 = "Pharmacology",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "A salamander is a warm blooded animal?",
                    mcq1 = "Maybe",
                    mcq2 = "Yes",
                    mcq3 = "No",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_bi_ex1",
            name = "Biology Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_bi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "A single piece of coiled DNA is known as a?",
                    mcq1 = "Chromosome",
                    mcq2 = "DNS",
                    mcq3 = "Cockroach",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "The area of biology of studying fungi is known as?",
                    mcq1 = "Zoology",
                    mcq2 = "Mycology",
                    mcq3 = "Pharmacology",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "A salamander is a warm blooded animal?",
                    mcq1 = "Maybe",
                    mcq2 = "Yes",
                    mcq3 = "No",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_bi_ex1",
            name = "Biology Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_bi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Death of every member of a species is",
                    mcq1 = "Extinction",
                    mcq2 = "External",
                    mcq3 = "Hibernation",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "A change of DNA that results in new trait is",
                    mcq1 = "Migration",
                    mcq2 = "Mutation",
                    mcq3 = "Emigration",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Botany is the study of?",
                    mcq1 = "Abdominal Cavity",
                    mcq2 = "Bots",
                    mcq3 = "Plants",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_bi_ex1",
            name = "Biology Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_bi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Death of every member of a species is",
                    mcq1 = "Extinction",
                    mcq2 = "External",
                    mcq3 = "Hibernation",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "A change of DNA that results in new trait is",
                    mcq1 = "Migration",
                    mcq2 = "Mutation",
                    mcq3 = "Emigration",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Botany is the study of?",
                    mcq1 = "Abdominal Cavity",
                    mcq2 = "Bots",
                    mcq3 = "Plants",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        // Chemistry Exams
        ExamModel(
            id = "gd3_ch_ex1",
            name = "Chemistry Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_ch",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "How much salt (NaCl) is in the human body",
                    mcq1 = "250 grams",
                    mcq2 = "1 KG",
                    mcq3 = "500 grams",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Which one is a noble gas?",
                    mcq1 = "Iron",
                    mcq2 = "Argon",
                    mcq3 = "Oxygen",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is the most common isotope of hydrogen",
                    mcq1 = "Tritum",
                    mcq2 = "Deuterium",
                    mcq3 = "Protium",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_ch_ex1",
            name = "Chemistry Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_ch",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "How much salt (NaCl) is in the human body",
                    mcq1 = "250 grams",
                    mcq2 = "1 KG",
                    mcq3 = "500 grams",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Which one is a noble gas?",
                    mcq1 = "Iron",
                    mcq2 = "Argon",
                    mcq3 = "Oxygen",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is the most common isotope of hydrogen",
                    mcq1 = "Tritum",
                    mcq2 = "Deuterium",
                    mcq3 = "Protium",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_ch_ex1",
            name = "Chemistry Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_ch",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "How much salt (NaCl) is in the human body",
                    mcq1 = "250 grams",
                    mcq2 = "1 KG",
                    mcq3 = "500 grams",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Which one is a noble gas?",
                    mcq1 = "Iron",
                    mcq2 = "Argon",
                    mcq3 = "Oxygen",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is the most common isotope of hydrogen",
                    mcq1 = "Tritum",
                    mcq2 = "Deuterium",
                    mcq3 = "Protium",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_ch_ex1",
            name = "Chemistry Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_ch",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Chemical Formula of Water",
                    mcq1 = "H2O",
                    mcq2 = "h5O",
                    mcq3 = "NaCl",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Which one is a noble gas?",
                    mcq1 = "Iron",
                    mcq2 = "Helium",
                    mcq3 = "Oxygen",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What is the most common isotope of nitrogen",
                    mcq1 = "Nitrogen-15",
                    mcq2 = "Deuterium",
                    mcq3 = "Protium",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        // History Exams
        ExamModel(
            id = "gd3_hi_ex1",
            name = "History Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_hi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Who is the Deputy Prime Minister?",
                    mcq1 = "Nick Clegg",
                    mcq2 = "James Bond",
                    mcq3 = "Barak Obama",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "How many wives did Henry VIII have?",
                    mcq1 = "Five",
                    mcq2 = "Six",
                    mcq3 = "Four",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What title was given to the rulers of Ancient Egypt",
                    mcq1 = "King of Kings",
                    mcq2 = "Queen",
                    mcq3 = "Pharaoh",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_hi_ex1",
            name = "History Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_hi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Who is the Deputy Prime Minister?",
                    mcq1 = "Nick Clegg",
                    mcq2 = "James Bond",
                    mcq3 = "Barak Obama",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "How many wives did Henry VIII have?",
                    mcq1 = "Five",
                    mcq2 = "Six",
                    mcq3 = "Four",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What title was given to the rulers of Ancient Egypt",
                    mcq1 = "King of Kings",
                    mcq2 = "Queen",
                    mcq3 = "Pharaoh",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_hi_ex1",
            name = "History Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_hi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Who is the Deputy Prime Minister?",
                    mcq1 = "Nick Clegg",
                    mcq2 = "James Bond",
                    mcq3 = "Barak Obama",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "How many wives did Henry VIII have?",
                    mcq1 = "Five",
                    mcq2 = "Six",
                    mcq3 = "Four",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What title was given to the rulers of Ancient Egypt",
                    mcq1 = "King of Kings",
                    mcq2 = "Queen",
                    mcq3 = "Pharaoh",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_hi_ex1",
            name = "History Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_hi",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Who is the Deputy Prime Minister?",
                    mcq1 = "Nick Clegg",
                    mcq2 = "James Bond",
                    mcq3 = "Barak Obama",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "How many wives did Henry VIII have?",
                    mcq1 = "Five",
                    mcq2 = "Six",
                    mcq3 = "Four",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "What title was given to the rulers of Ancient Egypt",
                    mcq1 = "King of Kings",
                    mcq2 = "Queen",
                    mcq3 = "Pharaoh",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        // Physics Exams
        ExamModel(
            id = "gd3_phy_ex1",
            name = "Physics Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd3_phy",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "A magnifying glass is what type of lens?",
                    mcq1 = "Convex",
                    mcq2 = "Concave",
                    mcq3 = "Round",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "A person who studies physics is known as a? ",
                    mcq1 = "Zoologist",
                    mcq2 = "Physicist",
                    mcq3 = "Biologist",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Electric power is typically measured in what units?",
                    mcq1 = "Millimeter",
                    mcq2 = "Kg",
                    mcq3 = "Watts",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd4_phy_ex1",
            name = "Physics Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd4_phy",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "A magnifying glass is what type of lens?",
                    mcq1 = "Convex",
                    mcq2 = "Concave",
                    mcq3 = "Round",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "A person who studies physics is known as a? ",
                    mcq1 = "Zoologist",
                    mcq2 = "Physicist",
                    mcq3 = "Biologist",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "Electric power is typically measured in what units?",
                    mcq1 = "Millimeter",
                    mcq2 = "Kg",
                    mcq3 = "Watts",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd5_phy_ex1",
            name = "Physics Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd5_phy",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Metals expand when heated and do what when cooled?",
                    mcq1 = "Contract",
                    mcq2 = "Divide",
                    mcq3 = "Break",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Electric resistance is typically measured in what units?",
                    mcq1 = "Joules",
                    mcq2 = "Ohms",
                    mcq3 = "Cm",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "The wire inside an electric bulb is known as the what?",
                    mcq1 = "Flutter",
                    mcq2 = "Flamingo",
                    mcq3 = "Filament",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
        ExamModel(
            id = "gd6_phy_ex1",
            name = "Physics Midterm 1 2022",
            percentageToPass = 50,
            topicId = "gd6_phy",
            status = ExamStatus.NOT_TAKEN,
            questionsList = listOf(
                QuestionModel(
                    id = "q1",
                    questionText = "Metals expand when heated and do what when cooled?",
                    mcq1 = "Contract",
                    mcq2 = "Divide",
                    mcq3 = "Break",
                    rightAnswer = 1
                ),
                QuestionModel(
                    id = "q2",
                    questionText = "Electric resistance is typically measured in what units?",
                    mcq1 = "Joules",
                    mcq2 = "Ohms",
                    mcq3 = "Cm",
                    rightAnswer = 2
                ),
                QuestionModel(
                    id = "q3",
                    questionText = "The wire inside an electric bulb is known as the what?",
                    mcq1 = "Flutter",
                    mcq2 = "Flamingo",
                    mcq3 = "Filament",
                    rightAnswer = 3
                ),
            ).shuffled()
        ),
    )

    fun getAllExams() = exams

    fun getExams(topicId: String?) =
        exams.filter { it.topicId == topicId }.map { it.copy() }.apply { setExamsStatuses() }

    private fun List<ExamModel>.setExamsStatuses() {
        this.forEach {
            it.status =
                ExamStatus.fromInt(
                    sharedPreference
                        ?.getInt(it.id, ExamStatus.NOT_TAKEN.value)
                        ?: ExamStatus.NOT_TAKEN.value
                )
        }
    }
}