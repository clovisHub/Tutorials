package com.clovis.myapplication

open class Child : Parent(), Walkable, Eatable
  {
     var name ="My name"

     override fun onEat(): String {
        return " Child is eating"
    }

    override fun onWalk(): String {
        return "Child is walking"
    }

      override fun speak(): String {
          return "Speak from child"
      }
//    override fun speak() : String {
//        return "Speak from child"
//    }

    fun singSong(voice: String = "Tenor", music: String = "None", singerName: String) : String {

        return "Voice: $voice, Music : $music and Singer: $singerName"
    }
}