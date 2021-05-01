package com.wixsite.mupbam1.resume.test_zaycev_net

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


var  res2 = "\n"
var res = ""
var task1 = arrayOf(7, "Developer")


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var res1: String

        for (n in 0 until task1.size)
        {
            res1 = task1[n].toString()
            res = res+res1+res2

               }

        button?.setOnClickListener {
            setResult(res)  }

    }

    fun setResult (str: String){
        result.append(str)
    }


}



