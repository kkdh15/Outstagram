package com.example.os_log_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var auth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        tv_signup.setOnClickListener {
            val intent = Intent(this, Signup_name::class.java)
            startActivity(intent)
        }
        btn_login.setOnClickListener {
            signinAndSignup()
        }
    }

    fun signinAndSignup() {
        auth?.createUserWithEmailAndPassword(tv_id.text.toString(), tv_signup_pw.text.toString())
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //Creating a user account
                    moveMainPage(task.result?.user)
                } else if (task.exception?.message.isNullOrEmpty()) {
                    //Show the error message
                    Toast.makeText(this,task.exception?.message, Toast.LENGTH_SHORT).show()
                } else {
                    //Login if you have account
                    signinEmail()
                }
            }
    }

    fun signinEmail() {
        auth?.signInWithEmailAndPassword(tv_id.text.toString(), tv_signup_pw.text.toString())
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //Login
                } else {
                    //Show the error message
                }
            }
    }
    fun moveMainPage(user:FirebaseUser?){
        if(user != null){
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}