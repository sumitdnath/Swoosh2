package com.example.swoosh2.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh2.Model.Player
import com.example.swoosh2.R
import com.example.swoosh2.Utilites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class skillActivity : BaseActitvity() {

     var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState!=null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
    fun onClickedBiginner(view: View){
        ballerBtn.isChecked = false
        player.skill = "Biginner"
    }
    fun onBallerClicked(view: View){
        bigennerBtn.isChecked = false
        player.skill = "Baller"

    }

    fun onSkillFinishClicked (view: View){
        if (player.skill != ""){
            val finish = Intent(this,finishActivity::class.java)
            finish.putExtra(EXTRA_PLAYER,player)
            startActivity(finish)
        }else{
            Toast.makeText(this,"Please Select Your Skill",Toast.LENGTH_SHORT).show()
        }

    }
}
