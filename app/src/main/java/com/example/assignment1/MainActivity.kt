package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etPassword: EditText
    lateinit var tvForgotPassword: TextView
    lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etPassword = findViewById(R.id.etPassword)

        tvForgotPassword = findViewById(R.id.tvForgotPassword)
        btnLogin = findViewById(R.id.btnLogin)


        etPassword.doOnTextChanged { text, _, _, _ ->
            if ((text?.length ?: 0) < 6) {
                etPassword.error = resources.getString(R.string.please_enter_password)
            } else {
                etPassword.error = null
            }
        }

        btnLogin.setOnClickListener {
            System.out.println("Clicked")
            var name = etName.text.toString()
            var password = etPassword.text.toString()
            System.out.println("name $name")
            if (name.isNullOrEmpty()) {
                etName.error = resources.getString(R.string.please_enter_name)
                etName.requestFocus()
            } else if (password.isNullOrEmpty()) {
                etPassword.error = resources.getString(R.string.please_enter_password)
                etPassword.requestFocus()
            } else if (password.length < 6) {
                etPassword.error = resources.getString(R.string.please_enter_password)
                etPassword.requestFocus()
            } else {
                var intent = Intent(this,activitylogin::class.java)
                startActivity(intent)
            }

        }
    }

}
