package com.example.nim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun choosePlayerVSIA(button: View)
    {
        val intent = Intent(this,chooseDifficultyIA::class.java)
        startActivity(intent)
    }

    fun choosePlayerVSPlayer(button: View)
    {
        val intent = Intent(this,choosePlayerVsPlayerNameActivity::class.java)
        startActivity(intent)
    }
}
