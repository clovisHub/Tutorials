package com.clovis.myapplication

class SampleClass : Parent(), Walkable, Eatable {

    override fun onWalk(): String {
        return "Walk from sample"
    }

    override fun onEat(): String {
        return "Eat from sample"
    }

    var name = " myself"

    fun createSample() : String {

        return "Hey I am sample"
    }

    private fun useMe() {
        this.createSample()
    }
}