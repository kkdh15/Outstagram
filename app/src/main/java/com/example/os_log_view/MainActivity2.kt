package com.example.os_log_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.os_log_view.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFrag(0)

        btn_home.setOnClickListener{
            setFrag(0)
        }
        btn_search.setOnClickListener{
            setFrag(1)
        }
        btn_add.setOnClickListener{
            setFrag(2)
        }
        btn_alarm.setOnClickListener{
            setFrag(3)
        }
        btn_mypage.setOnClickListener{
            setFrag(4)
        }
    }

    private fun setFrag(fragNum: Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum) {
            0 -> {
                ft.replace(R.id.main_frame, Home()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame, Search()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Add()).commit()
            }
            3 -> {
                ft.replace(R.id.main_frame, Alarm()).commit()
            }
            4 -> {
                ft.replace(R.id.main_frame, User()).commit()
            }
        }

    }
}
