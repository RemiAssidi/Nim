package com.example.nim

import android.view.View
import kotlinx.android.synthetic.main.activity_play.*

class Game(var player1: Player, var player2: Player, var nbrAlumette: Int = 20, var Start: Int = 0)
{

    private fun substract(i: Int) {
        this.nbrAlumette = this.nbrAlumette - i
    }

    fun soustraire1(){
        substract(1)
    }

    fun soustraire2(){
        substract(2)
    }

    fun soustraire3(){
        substract(3)
    }

    fun changePlayer() : String{
        if (this.Start == 0)
        {
            this.Start = 1
            return player2.pseudo
        } else {
            this.Start = 0
            return player1.pseudo
        }

    }

    fun verifyScore(): Int{
        if (this.nbrAlumette < 0)
        {
            this.nbrAlumette = 0
        }
        return this.nbrAlumette
    }

    fun win() : String
    {
        val winner = changePlayer()
        return winner
    }
}