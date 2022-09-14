package com.example.scoreapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
public class Team(private var teamName: String, private var teamScore:Int=0) : Parcelable {
    fun setTeamScore(teamScore: Int){
        this.teamScore=teamScore
    }
    fun getTeamName():String{
        return this.teamName
    }
    fun getTeamScore():Int{
        return this.teamScore
    }
    }
