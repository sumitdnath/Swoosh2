package com.example.swoosh2.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh2.Model.Player
import com.example.swoosh2.R
import com.example.swoosh2.Utilites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class leagueActivity : BaseActitvity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player= savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked (view: View) {
        womanLeagueaBtn.isChecked = false
        co_edLeagueBtn.isChecked = false
        player.league = "Mens"

    }
    fun onWomanClicked (view: View) {
        menLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false
        player.league = "Woman"

    }
    fun onCoEdClicked (view: View) {
        menLeagueBtn.isChecked = false
        womanLeagueaBtn.isChecked = false
        player.league = "CO-ED"

    }
    fun onLeagueNextBtn (view: View) =  if (player.league != ""){
            val skill = Intent(this, skillActivity::class.java)
            skill.putExtra(EXTRA_PLAYER,player)
            startActivity(skill)
        }else{
            Toast.makeText(this,"Please Select A League",Toast.LENGTH_SHORT).show()

    }
}
