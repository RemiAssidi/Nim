package com.example.nim

import org.junit.Test

import org.junit.Assert.*

class IATest {

    @Test
    fun play() {
        val ia = IA("Hard")
        val number = ia.play(20)
        assertTrue(number in 1..3)
    }
}