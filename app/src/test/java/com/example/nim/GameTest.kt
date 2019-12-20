package com.example.nim

import org.junit.Assert.*
import org.junit.Test

class GameTest {
    @Test
    fun soustraire1() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        game.soustraire1()
        assertEquals(20 , game.nbrAlumette + 1 )
    }

    @Test
    fun soustraire2() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        game.soustraire2()
        assertEquals(20 , game.nbrAlumette + 2 )
    }

    @Test
    fun soustraire3() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        game.soustraire3()
        assertEquals(20 , game.nbrAlumette + 3 )
    }

    @Test
    fun changePlayer() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        var name = game.changePlayer()
        assertEquals(game.player2.pseudo , name )
    }

    @Test
    fun verifyScore() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        game.nbrAlumette = -1
        game.verifyScore()
        assertEquals(0 , game.nbrAlumette )
    }

    @Test
    fun win() {
        var p1 = Player("Player 1", 0)
        var p2 = Player("Player 2", 0)
        var game = Game(p1, p2, 20, 0)
        var winner = game.win()
        assertEquals(game.player2.pseudo , winner)
    }

}
