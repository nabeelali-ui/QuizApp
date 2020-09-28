package com.nabeel.quizapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.nabeel.quizapp.Constants.USER_NAME
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)

        val isLoggedIn=sharedPreferences.getBoolean("isLoggedIn",false)

        setContentView(R.layout.activity_main)

        if(isLoggedIn){

            val intent=Intent(this@MainActivity,SelectionScreen::class.java)
            startActivity(intent)
            finish()
        }

        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN



        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent=Intent(this,SelectionScreen::class.java)
                /*intent.putExtra(Constants.USER_NAME,et_name.text.toString())*/
                savePreferences(et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }

    fun savePreferences(title:String){

        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("Title",title).apply()

    }

}