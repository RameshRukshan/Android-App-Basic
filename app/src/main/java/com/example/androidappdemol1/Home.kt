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

            var f_name = findViewById<EditText>(R.id.txt_fName).text.toString()
            var l_name = findViewById<EditText>(R.id.txt_lName).text.toString()
            var email = findViewById<EditText>(R.id.txt_email).text.toString()
            var tel = findViewById<EditText>(R.id.txt_tel).text.toString()

            to_mem_dashboard.putExtra("first_name",f_name)
            to_mem_dashboard.putExtra("last_name",l_name)
            to_mem_dashboard.putExtra("email",email)
            to_mem_dashboard.putExtra("tel",tel)

            startActivity(to_mem_dashboard)
        }

        btn_clear.setOnClickListener(){
            f_name.setText("First Name")
            l_name.setText("Last Name")
            email.setText("Email Address")
            tel.setText("Telephone Number")
        }
    }
}