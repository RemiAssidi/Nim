package com.example.nim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_play.*
import kotlin.concurrent.thread


class PlayActivity : AppCompatActivity() {


    var p1 = Player("Player 1", 0)
    var p2 = Player("Player 2", 0)
    var ia = IA("Easy")
    var difficulty = "playervsplayer"

    var game = Game(p1, p2, 20, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
        var namePlayer1: String = intent.getStringExtra("player").toString()
        difficulty = intent.getStringExtra("difficulty").toString()
        if (difficulty == "playervsplayer") {
            p2.pseudo = intent.getStringExtra("player2").toString()
        } else {
            ia.difficulty = difficulty
            p2.pseudo = intent.getStringExtra("computer").toString()
        }
        p1.pseudo = namePlayer1
        Player.text = p1.pseudo
    }

    fun soustraire1(button: View)
    {
        game.soustraire1()
        play()
    }

    fun soustraire2(button: View)
    {
        game.soustraire2()
        play()
    }

    fun soustraire3(button: View)
    {
        game.soustraire3()
        play()
    }

    fun play()
    {
        var nbrAlumette = game.verifyScore()
        calculate(nbrAlumette)
        if (difficulty != "playervsplayer" && nbrAlumette != 0){
            playIA(nbrAlumette)
        }
    }

    fun playIA(nbrAlumette: Int){
        var number = ia.play(nbrAlumette)
        if (number == 1){
            game.soustraire1()
        } else if (number == 2){
            game.soustraire2()
        } else {
            game.soustraire3()
        }
        var nbrAlumette = game.verifyScore()
        calculate(nbrAlumette)
    }

    fun calculate(nbrAlumette: Int){
        if (nbrAlumette == 0)
        {
            alumette.text = "0"
            sendWinner()
        } else {
            updateDisplay()
        }
    }

    fun updateDisplay(){
        val nbrAlumette = game.nbrAlumette
        alumette.text = "${nbrAlumette}"
        Player.text = game.changePlayer()
    }

    fun sendWinner(){
        val winner : String = game.win()
        Log.i("winner","before")
        Log.i("winner", winner)
        val intent = Intent(this,WinActivity::class.java)
        intent.putExtra("winner", winner)
        startActivity(intent)
    }
}
