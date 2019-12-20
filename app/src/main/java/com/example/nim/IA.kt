package com.example.nim

class IA (var difficulty: String)
{
    fun play(nbrAlumette: Int): Int
    {
        if(this.difficulty == "Hard"){
            if (nbrAlumette == 2){
                return 1
            } else if (nbrAlumette == 3){
                return 2
            } else if (nbrAlumette == 4){
                return 3
            } else if (nbrAlumette == 6){
                return 1
            } else if (nbrAlumette == 7){
                return 2
            } else if (nbrAlumette == 8){
                return 3
            } else if (nbrAlumette == 10){
                return 1
            } else if (nbrAlumette == 11){
                return 2
            }

        }
        val randomNumber: Int = (1..3).random()
        return randomNumber
    }
}