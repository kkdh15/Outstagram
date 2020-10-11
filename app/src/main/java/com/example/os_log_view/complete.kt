package com.example.os_log_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complete.*

class complete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

        if(intent.hasExtra("id")){
            textView11.setText(intent.getStringExtra("id"))
        }
    }
}