package com.felipe.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btnStartGame.setOnClickListener{
            val nextView = Intent(this, MainActivity::class.java)

            nextView.putExtra(Constans.player_one, etPlayer1.text.toString())
            nextView.putExtra(Constans.player_two, etPlayer2.text.toString())

            startActivity(nextView)
            finish()
        }
    }
}
