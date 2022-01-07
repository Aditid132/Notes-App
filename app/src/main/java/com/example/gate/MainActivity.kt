package com.example.gate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.home_btn)
        button2 = findViewById(R.id.keep_btn)
    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
            var intent = Intent(this , BranchActivity::class.java)
            startActivity(intent)

        }
        button2.setOnClickListener {
            var intent = Intent(this , NotesKeepActivity ::class.java)
            startActivity(intent)
        }

    }
}