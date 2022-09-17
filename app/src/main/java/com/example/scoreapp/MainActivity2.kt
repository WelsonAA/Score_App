package com.example.scoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var winText: TextView =findViewById<TextView>(R.id.winnertext)
        val winner :Team? = intent.getParcelableExtra<Team>("winner")
        winText.text="Team ${winner?.getTeamName()} won"
    }
}