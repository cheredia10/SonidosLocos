package com.sonidos.locos

enum class SoundCategory {
    ANIMALS,
    EFFECTS,
    INSTRUMENTS,
    VOICES
}

data class Sound(val name: String, val category: SoundCategory)

class SoundBoard {
    /**
     * Map of categories to their sounds. A [LinkedHashMap] is used so that the
     * insertion order of categories is preserved.
     */
    private val categories = LinkedHashMap<SoundCategory, MutableList<Sound>>()

    /**
     * Add a [Sound] to the board. If the sound's category hasn't been seen
     * before, it will be inserted preserving the insertion order of
     * categories.
     */
    fun addSound(sound: Sound) {
        val sounds = categories.getOrPut(sound.category) { mutableListOf() }
        sounds += sound
    }

    /**
     * Return all sounds belonging to the given [category]. If no sounds have
     * been added in that category, an empty list is returned.
     */
    fun getSoundsByCategory(category: SoundCategory): List<Sound> {
        return categories[category].orEmpty()
    }

    /**
     * Returns the list of categories in the order they were first introduced to
     * the board.
     */
    fun categories(): List<SoundCategory> = categories.keys.toList()
}
