package com.example.diveroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageSrc: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.roll)
        imageSrc = findViewById(R.id.dice)
        button.setOnClickListener {
            randomNumber()
        }
    }

    private fun randomNumber() {
        val src = when (Random.nextInt(1, 7)) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        imageSrc.setImageResource(src)
    }
}