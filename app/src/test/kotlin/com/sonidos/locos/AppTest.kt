package com.sonidos.locos

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun soundBoardHasCategories() {
        val board = SoundBoard()
        board.addSound(Sound("Dog", SoundCategory.ANIMALS))
        board.addSound(Sound("Explosion", SoundCategory.EFFECTS))
        val categories = board.categories()
        assertEquals(listOf(SoundCategory.ANIMALS, SoundCategory.EFFECTS), categories)
    }
}
