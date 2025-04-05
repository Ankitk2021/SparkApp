package com.ankitkumar.project.sparkapp

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class open_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_open_screen)

        val btn = findViewById<ImageButton>(R.id.imageButton)
        val btn2 = findViewById<ImageButton>(R.id.imageButton2)

        val anim = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        btn.setOnClickListener{
            btn.startAnimation(anim)
        }
        btn2.setOnClickListener{
            btn2.startAnimation(anim)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}