package com.example.os_log_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup_name.*
import kotlinx.android.synthetic.main.activity_signup_name.btn_next1
import kotlinx.android.synthetic.main.activity_signup_pw.*

class Signup_pw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_pw)

        btn_next2.setOnClickListener{
            val intent_pw = Intent(this, complete::class.java)
            startActivity(intent_pw)
        }
    }
}