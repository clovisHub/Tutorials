package com.clovis.myapplication

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(), Eatable {

    override fun onEat(): String {
        return "Yes from viewModel"
    }

}