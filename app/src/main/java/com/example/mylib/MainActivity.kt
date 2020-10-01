package com.example.mylib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lib.MyApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApp().test()
    }
}