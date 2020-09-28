package com.nabeel.quizapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selection_screen.*

var a:Int=0

class SelectionScreen : AppCompatActivity() {

    private var nUserName: String? = null
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)

        setContentView(R.layout.activity_selection_screen)

        /*nUserName = intent.getStringExtra(Constants.USER_NAME)*/
        nUserName=sharedPreferences.getString("Title",null)

        tv_un.text = nUserName

        btn_select.setOnClickListener {

            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, nUserName)

            startActivity(intent)
            finish()

        }
        btn_logo.setOnClickListener {

            a++
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, nUserName)

            startActivity(intent)
            finish()

        }





    }
}