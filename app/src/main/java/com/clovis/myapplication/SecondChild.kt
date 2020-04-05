package com.clovis.myapplication

open class SecondChild : Parent(), Walkable, Eatable {

    override fun onEat(): String {
        return "Second Child is eating"
    }

    override fun onWalk(): String {
        return "Second Child is walking"
    }

    override fun speak() : String {
        return "Speak from Second child"
    }
}

interface Walkable {

    fun onWalk(): String
}

interface Eatable {

    fun onEat(): String
}