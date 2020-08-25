package com.recyclerview.recyclerviewandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_screen.*
import kotlinx.android.synthetic.main.activity_third_screen.*

class ThirdScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)

        if (intent.hasExtra("steps")) {
            thirdScreenText.text = "ThirdScreen"+(intent.getStringExtra("steps"))
        }

    }
}