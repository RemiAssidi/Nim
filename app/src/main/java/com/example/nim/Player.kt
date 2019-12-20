package com.example.nim

public class Player(var pseudo: String, var score: Int = 0)
{
    fun Win()
    {
        this.score += 1
    }

    fun Lose()
    {
        this.score --
        if(this.score < 0)
        {
            score = 0
        }
    }
}