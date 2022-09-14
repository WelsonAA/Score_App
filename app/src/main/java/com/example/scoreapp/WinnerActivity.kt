package com.example.scoreapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WinnerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.winner_activity)
        var winText:TextView =findViewById<TextView>(R.id.winnertext)

        val winner :Team? = intent.getParcelableExtra<Team>("WinnerTeam")
        winText.text="Team ${winner?.getTeamName()} won"
    }
}