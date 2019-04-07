package com.example.swoosh2.Controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh2.Model.Player
import com.example.swoosh2.R
import com.example.swoosh2.Utilites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class finishActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text= "Looking For ${player.league} ${player.skill} near at you..."

    }



}
