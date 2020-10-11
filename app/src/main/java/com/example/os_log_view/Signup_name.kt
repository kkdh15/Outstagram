package com.example.os_log_view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup_name.*

class Signup_name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_name)

        val intent_id = Intent(this, complete::class.java)
        intent_id.putExtra("msg",tv_username.text.toString())

        btn_next1.setOnClickListener{
            val nextintent = Intent(this, Signup_pw::class.java)
            startActivity(nextintent)
        }
    }
}