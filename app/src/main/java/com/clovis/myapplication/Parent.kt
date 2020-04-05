package com.clovis.myapplication

open class Parent {

    var word = "I am the Parent"

    open fun speak(): String {
        return  word
    }
}

open class Mother {

    var word = "I am the mother"

    open fun speak(): String {
        return  word
    }
}


