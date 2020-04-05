package com.clovis.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textId)

        var myString = "yannick"

        val myChild = GrandChild()
        val secondChild = SecondChild()

        //myString = "${myChild.speak()} and ${secondChild.speak()}"
        //myString = myChild.singSong(singerName = "Nico")
        myString = myChild.onEat() + " " + secondChild.onEat()

        val list : MutableList<String> = mutableListOf()
        list.add("Yanick")
        list.add("Milton")
        list.add("Clovis")

        list.forEach { word ->
            if(word.startsWith("C", true)) {
                Log.d("first", word)
                word.forEach {
                    if(it.toUpperCase() == 'O') {
                        Log.d("first", it.toUpperCase().toString())
                    }
                }
            }
        }

//        for(name in list) {
//            Log.d("first", name)
//        }

        textView.text = myString
    }
}
