package com.example.a2_edittext_toast

import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var et_name:EditText = findViewById(R.id.et_myname)
        var btn_show:Button = findViewById(R.id.btn_show)

        btn_show.setOnClickListener {

            Toast.makeText(this,et_name.text.toString(),Toast.LENGTH_LONG).show()
        }

    }}

