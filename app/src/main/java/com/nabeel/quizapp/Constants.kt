package com.nabeel.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_america1, "Argentina",
            "America",
            "India",
            "Austria",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.flag_india1, "Afghanistan",
            "Pakistan",
            "India",
            "Bangladesh",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.flag_denmark1, "Denmark",
            "Pakistan",
            "Russia",
            "jordan",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.flag_afghanistan1, "Bulgaria",
            "China",
            "Chile",
            "Afghanistan",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.falg_bangladesh1, "Bangladesh",
            "Pakistan",
            "India",
            "Bhutan",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.flag_egypt, "Ethiopia",
            "Fiji",
            "Georgia",
            "Egypt",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.flag_iceland, "Hungary",
            "Iceland",
            "Germany",
            "Jamaica",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.flag_greece, "Greece",
            "Iran",
            "Indonesia",
            "Iraq",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.flag_italy, "Argentina",
            "Israel",
            "Italy",
            "Ireland",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.flag_japan, "Lebanon",
            "Jordan",
            "Japan",
            "Libya",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}