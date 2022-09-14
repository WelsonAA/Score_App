package com.example.scoreapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var teamA = Team("A")
    var teamB = Team("B")
    private lateinit var resetter: Button
    private lateinit var Afree: Button
    private lateinit var Apoints2: Button
    private lateinit var Apoints3: Button
    private lateinit var Bfree: Button
    private lateinit var Bpoints2: Button
    private lateinit var Bpoints3: Button
    private lateinit var Ascore: TextView
    private lateinit var Bscore: TextView
    private lateinit var winner: TextView


    private fun initializers() {
        resetter = findViewById<Button>(R.id.resetter)
        Afree = findViewById<Button>(R.id.teamA_1)
        Apoints2 = findViewById<Button>(R.id.teamA_2)
        Apoints3 = findViewById<Button>(R.id.teamA_3)
        Bfree = findViewById<Button>(R.id.teamB_1)
        Bpoints2 = findViewById<Button>(R.id.teamB_2)
        Bpoints3 = findViewById<Button>(R.id.teamB_3)
        Ascore = findViewById<TextView>(R.id.teamA_score)
        Bscore = findViewById<TextView>(R.id.teamB_score)
        winner = findViewById<TextView>(R.id.winner)
    }

    private fun updateScores() {
        Ascore.text = teamA.getTeamScore().toString()
        Bscore.text = teamB.getTeamScore().toString()

        if (teamA.getTeamScore() - teamB.getTeamScore() >= 20){
            val intent= Intent(this,WinnerActivity::class.java)
            winner.text =getString(R.string.teamAwins)
            intent.putExtra("winner",teamA)
            startActivity(intent)}
        else if (teamA.getTeamScore() - teamB.getTeamScore() <= -20) {
            val intent= Intent(this,WinnerActivity::class.java)
            winner.text = getString(R.string.teamBwins)
            intent.putExtra("winner",teamB)
            startActivity(intent)
        } else winner.text = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score_board)
        initializers()
        Ascore.text = teamA.getTeamScore().toString()
        Bscore.text = teamB.getTeamScore().toString()
        Afree.setOnClickListener {
            teamA.setTeamScore(1 + teamA.getTeamScore())
            updateScores();
        }
        Apoints2.setOnClickListener {
            teamA.setTeamScore(2 + teamA.getTeamScore())
            updateScores();
        }
        Apoints3.setOnClickListener {
            teamA.setTeamScore(3 + teamA.getTeamScore())
            updateScores();
        }
        Bfree.setOnClickListener {
            teamB.setTeamScore(1 + teamB.getTeamScore())
            updateScores();
        }
        Bpoints2.setOnClickListener {
            teamB.setTeamScore(2 + teamB.getTeamScore())
            updateScores()
        }

        Bpoints3.setOnClickListener {
            teamB.setTeamScore(3 + teamB.getTeamScore())
            updateScores()
        }
        resetter.setOnClickListener {
            teamA.setTeamScore(0)
            teamB.setTeamScore(0)
            updateScores()
        }
    }
}

