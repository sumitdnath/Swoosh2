package com.example.swoosh2.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActitvity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val league = Intent(this, leagueActivity::class.java)
            startActivity(league)
        }


    }
}
