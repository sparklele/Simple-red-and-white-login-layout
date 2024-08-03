
package com.example.learnxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnxml.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
public class MainActivity : ComponentActivity() {
/*
    lateinit var confirmBT : Button
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val confirmBT : Button = findViewById(R.id.confirmBT)
        val textView : TextView = findViewById(R.id.textview)
        confirmBT.setOnClickListener{
            textView.text="confirmed!"
        }
    }
    */
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_activity)
    }
 }
