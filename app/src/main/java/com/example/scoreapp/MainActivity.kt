package com.example.scoreapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var resetter: Button
    private lateinit var Afree: Button
    private lateinit var Apoints2: Button
    private lateinit var Apoints3: Button
    private lateinit var Bfree: Button
    private lateinit var Bpoints2: Button
    private lateinit var Bpoints3: Button
    private lateinit var Ascore: TextView
    private lateinit var Bscore: TextView
    private lateinit var winner:TextView
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resetter =findViewById<Button>(R.id.resetter)
        val Afree=findViewById<Button>(R.id.teamA_1)
        val Apoints2=findViewById<Button>(R.id.teamA_2)
        val Apoints3=findViewById<Button>(R.id.teamA_3)
        val Bfree=findViewById<Button>(R.id.teamB_1)
        val Bpoints2=findViewById<Button>(R.id.teamB_2)
        val Bpoints3=findViewById<Button>(R.id.teamB_3)
        val Ascore=findViewById<TextView>(R.id.teamA_score)
        val Bscore=findViewById<TextView>(R.id.teamB_score)
        val winner=findViewById<TextView>(R.id.winner)
        Ascore.setText(scoreA)
        Bscore.setText(scoreB)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            Afree.id -> ++scoreA
            Bfree.id -> ++scoreB
            Apoints2.id -> scoreA+=2
            Bpoints2.id -> scoreB+=2
            Apoints3.id ->scoreA+=3
            Bpoints3.id ->scoreB+=3
            resetter.id ->{
                scoreA=0
                scoreB=0
            }
        }
        Ascore.text=scoreA.toString()
        Ascore.text=scoreB.toString()
    }
    }

