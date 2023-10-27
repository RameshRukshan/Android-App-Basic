package com.example.androidappdemol1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.time.Instant

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var nav_items = arrayOf("Home","About","Products","Contact")

        var f_name = findViewById<EditText>(R.id.txt_fName)
        var l_name = findViewById<EditText>(R.id.txt_lName)
        var email = findViewById<EditText>(R.id.txt_email)
        var tel = findViewById<EditText>(R.id.txt_tel)

        var btn_submit = findViewById<Button>(R.id.btn_submit)
        var btn_clear = findViewById<Button>(R.id.btn_clear)

        btn_submit.setOnClickListener(){
            var to_mem_dashboard = Intent(this,member_dashboard::class.java)

            startActivity(to_mem_dashboard)
        }
    }
}