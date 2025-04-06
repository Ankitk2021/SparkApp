package com.ankitkumar.project.sparkapp

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val sign_up_go_btn = findViewById<Button>(R.id.sign_up_go_btn)
        val anim = AnimationUtils.loadAnimation(this,R.anim.scale_up)
        sign_up_go_btn.setOnClickListener {
           //sign_up_go_btn.startAnimation(anim)
          
            startActivity(Intent(this,Create_an_Account::class.java))
            overridePendingTransition(R.anim.activity_enter,R.anim.activity_exit)
            finish()

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.activity_enter,R.anim.activity_exit)
    }
}