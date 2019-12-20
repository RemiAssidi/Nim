package com.example.nim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_choose_player_vs_player_name.*

class choosePlayerVsPlayerNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_player_vs_player_name)
    }

    fun startGame(button: View){
        val intent = Intent(this,PlayActivity::class.java)
        val player1 = player1Name.text.toString()
        val player2 = player2Name.text.toString()
        intent.putExtra("player", player1)
        intent.putExtra("player2", player2)
        intent.putExtra("difficulty", "playervsplayer")
        startActivity(intent)
    }
}
