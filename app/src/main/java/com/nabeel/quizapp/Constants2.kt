package com.nabeel.quizapp

object Constants2 {

    /*const val USER_NAME:String="user_name"*/
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "Guess the logo?",
            R.drawable.audi_logo, "Audi",
            "Nissan",
            "Bentley",
            "Honda",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Guess the logo?",
            R.drawable.hp_logo, "Lenovo",
            "Asus",
            "Hewlett packard",
            "Dell",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Guess the logo?",
            R.drawable.starbucks_logo2, "Subway",
            "Burger King",
            "McDonalds",
            "Starbucks",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Guess the logo?",
            R.drawable.apple_logo1, "Oppo",
            "Motorola",
            "Apple",
            "Samsung",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Guess the logo?",
            R.drawable.ig_logo, "Facebook",
            "Instagram",
            "WhatsApp",
            "LinkedIn",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Guess the logo?",
            R.drawable.gucci_logo, "Armani",
            "ShoppersStop",
            "Woodland",
            "Gucci",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Guess the logo?",
            R.drawable.pinterest_logo, "Snapchat",
            "Pinterest",
            "Google",
            "VLC",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Guess the logo?",
            R.drawable.pepsi_logo, "Britannia",
            "Coca cola",
            "Sprite",
            "Pepsi",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Guess the logo?",
            R.drawable.unity_logo, "Unreal",
            "Android Studio",
            "Unity",
            "SketchUp",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Guess the logo?",
            R.drawable.kingfisher_logo, "Tuborg",
            "Corona",
            "Kingfisher",
            "Red Bull",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}