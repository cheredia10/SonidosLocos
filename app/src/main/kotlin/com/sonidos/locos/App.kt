package com.sonidos.locos

class App {
    val greeting: String
        get() = "Bienvenido a Sonidos Locos!"
}

fun main() {
    val board = SoundBoard()
    board.addSound(Sound("Dog Bark", SoundCategory.ANIMALS))
    board.addSound(Sound("Cat Meow", SoundCategory.ANIMALS))
    board.addSound(Sound("Explosion", SoundCategory.EFFECTS))
    board.addSound(Sound("Bell", SoundCategory.INSTRUMENTS))
    board.addSound(Sound("Laugh", SoundCategory.VOICES))

    println(App().greeting)
    println("Categorias disponibles:")
    board.categories().forEachIndexed { index, category ->
        println("${index + 1}. $category")
        val sounds = board.getSoundsByCategory(category)
        sounds.forEach { sound ->
            println("   - ${sound.name}")
        }
    }
}
