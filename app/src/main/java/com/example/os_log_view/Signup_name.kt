package com.example.os_log_view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_signup_name.*

class Signup_name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_name)
        btn_next1.setOnClickListener{
            val intent_id = Intent(this, Signup_pw::class.java)
            intent_id.putExtra("id",tv_username.text.toString())
            startActivity(intent_id)
        }
        tv_username.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                btn_next1.setBackgroundColor(Color.BLUE)
                btn_next1.setEnabled(true)
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })
    }
}