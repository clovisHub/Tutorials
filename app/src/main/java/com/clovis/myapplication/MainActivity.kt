package com.clovis.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit  var textView: TextView
    private lateinit var viewModel: MyViewModel

    override fun onClick(v: View?) {

        if(v == textView.textId) {

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textId)
        textView.setOnClickListener(this)
        viewModel = MyViewModel()
        viewModel.onEat()
        var list : ArrayList<Int> = arrayListOf()
        list.add(100)
        list.add(-35)
        list.add(-20)
        list.add(11)
        list.add(84)
        list.add(-11)
        list.add(19)
        var j = 0

        run loop@ {
            list.forEach { i ->
                if(i == -11) {
                    println(i)
                    return@loop
                }
                println("for "+j)
                j++
            }
        }



//
         var myString = "yannick"
//        val myChild = Child()
//        val result = myChild.speak()
//
//
//        val grandChild = GrandChild()
//        Log.d("result", grandChild.onEat())
        //val yannick : Parent = ChildOnline()
        //val milton : Parent = Parent()

        //val yannick : Child = Child()
        //val milton : Child = Parent() as Child

        //Log.d("result", yannick.speak())
        //Log.d("result", milton.speak())
        //Log.d("result", result)
        //myChild.
        //val secondChild = SecondChild()

        //myString = "${myChild.speak()} and ${secondChild.speak()}"
        //myString = myChild.speak()
        //Log.d("first", myString)
        //myString = myChild.singSong(singerName = "Nico")
        //myString = myChild.onEat() + " " + secondChild.onEat()

//        val list : MutableList<String> = mutableListOf()
//        list.add("Yanick")
//        list.add("Milton")
//        list.add("Clovis")
//
//        list.forEach { word ->
//            if(word.startsWith("C", true)) {
//                Log.d("first", word)
//                word.forEach {
//                    if(it.toUpperCase() == 'O') {
//                        Log.d("first", it.toUpperCase().toString())
//                    }
//                }
//            }
//        }

//        for(name in list) {
//            Log.d("first", name)
//        }

        textView.text = myString
    }
}
