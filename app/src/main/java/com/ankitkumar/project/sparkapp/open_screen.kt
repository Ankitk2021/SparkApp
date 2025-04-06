package com.ankitkumar.project.sparkapp

import android.content.Intent
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

        val create_acc_btn = findViewById<ImageButton>(R.id.imageButton_create_acc_open)
        val sign_acc_btn = findViewById<ImageButton>(R.id.imageButton_sign_in_open)

        val anim = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        create_acc_btn.setOnClickListener{
            startActivity(Intent(this,Create_an_Account::class.java))
            overridePendingTransition(R.anim.activity_enter,R.anim.activity_exit)
            create_acc_btn.startAnimation(anim)
           // finish()
        }
        sign_acc_btn.setOnClickListener{
            startActivity(Intent(this,Login::class.java))
            overridePendingTransition(R.anim.activity_enter,R.anim.activity_exit)
            sign_acc_btn.startAnimation(anim)
         //   finish()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}