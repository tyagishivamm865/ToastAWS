package com.example.mytoast

import android.content.Context
import android.widget.Toast

object Toasty {

    fun show(context:Context){
        Toast.makeText(context,"Hello Android",Toast.LENGTH_SHORT).show()
    }
}