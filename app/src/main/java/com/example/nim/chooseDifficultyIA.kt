package com.example.nim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_choose_difficulty_i.*
import kotlinx.android.synthetic.main.activity_choose_player_vs_player_name.*

class chooseDifficultyIA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_difficulty_i)
    }

    fun easy(button: View){
        val intent = Intent(this,PlayActivity::class.java)
        val computer = computerName.text.toString()
        val player = playerName.text.toString()
        intent.putExtra("computer", computer)
        intent.putExtra("player", player)
        intent.putExtra("difficulty", "Easy")
        startActivity(intent)
    }

    fun hard(button: View){
        val intent = Intent(this,PlayActivity::class.java)
        val computer = computerName.text.toString()
        val player = playerName.text.toString()
        intent.putExtra("computer", computer)
        intent.putExtra("player", player)
        intent.putExtra("difficulty", "Hard")
        startActivity(intent)
    }
}
