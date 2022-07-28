package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

class logininfo : AppCompatActivity() {


lateinit var etName: EditText
lateinit var etemail: EditText
lateinit var etPhone: EditText
lateinit var etpassword: EditText
lateinit var etgender: EditText
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    etName = findViewById(R.id.etName)
    etemail = findViewById(R.id.etEmail)
    etPhone = findViewById(R.id.etPhone)
    etpassword = findViewById(R.id.etPassword)
    etgender = findViewById(R.id.rgGender)

    etName.doOnTextChanged { text, _, _, _ ->
        if ((text?.length ?: 0) < 10) {

            etName.error = resources.getString(R.string.enter_name)

        }}
        etemail.doOnTextChanged { text, _, _, _ ->
            if ((text?.length ?: 0) < 10) {
                etemail.error = "Enter_email"

            }}
            etPhone.doOnTextChanged { text, _, _, _ ->
                if ((text?.length ?: 0) < 10) {
                    etPhone.error = "Enter_a_valid_Phone"
                }}
                etpassword.doOnTextChanged { text, _, _, _ ->
                    if ((text?.length ?: 0) < 10) {
                        etpassword.error = "Enter_password"

                    }}

                }
            }




