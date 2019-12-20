package com.example.nim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_win.*
import kotlin.math.log

class WinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("winner", "in")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)
        val winner = intent.getStringExtra("winner")
        Log.i("winner", winner)
        printPlayer.text = winner
    }

    fun play(button: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun exit(button: View){
        finishAffinity()
    }
}
