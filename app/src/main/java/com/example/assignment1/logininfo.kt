package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

class logininfo : AppCompatActivity() {


lateinit var etName: EditText
lateinit var etemail: EditText
lateinit var etPhone: EditText
lateinit var etpassword: EditText
    lateinit var rgGender: RadioGroup
    lateinit var rbHe: RadioButton
    lateinit var rbShe: RadioButton
    lateinit var rbOther: RadioButton
    lateinit var etOtherName: EditText
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    etName = findViewById(R.id.etName)
    etemail = findViewById(R.id.etEmail)
    etPhone = findViewById(R.id.etPhone)
    etpassword = findViewById(R.id.etPassword)
    rbHe = findViewById(R.id.rbHe)
    rbShe = findViewById(R.id.rbShe)
    rbOther = findViewById(R.id.rbOthers)
    rgGender = findViewById(R.id.rgGender)
    etOtherName = findViewById(R.id.etOtherName)

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
    rbHe = findViewById(R.id.rbHe)
    rbShe = findViewById(R.id.rbShe)
    rbOther = findViewById(R.id.rbOthers)
    rgGender = findViewById(R.id.rgGender)
    rgGender.setOnCheckedChangeListener() { RadioGroup, id ->
        when (id) {
            R.id.rbOthers -> {
                Toast.makeText(
                    this,
                    resources.getString(R.string.Others),
                    Toast.LENGTH_LONG
                ).show()
                etOtherName.visibility = View.VISIBLE
            }
            else -> {
                etOtherName.visibility = View.INVISIBLE
            }
        }
    }
    rbOther.setOnCheckedChangeListener { _, isChecked ->
        if (isChecked) {
            etOtherName.visibility = View.VISIBLE
        } else {
            etOtherName.visibility = View.INVISIBLE
        }
                }
            }}




