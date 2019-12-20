package com.example.nim

import org.junit.Test

import org.junit.Assert.*

class PlayerTest {

    @Test
    fun win() {
        var p1 = Player("Player 1", 0)
        p1.Win()
        assertEquals(1 , p1.score )
    }

    @Test
    fun lose() {
        var p1 = Player("Player 1", 0)
        p1.Win()
        p1.Win()
        p1.Lose()
        assertEquals(1 , p1.score )
    }
}