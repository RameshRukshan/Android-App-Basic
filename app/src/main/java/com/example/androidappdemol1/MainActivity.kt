package com.example.androidappdemol1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<TextView>(R.id.txt_username).text.toString()
        var password = findViewById<TextView>(R.id.txt_password).text.toString()
        var message = findViewById<TextView>(R.id.txt_message)

        var btn = findViewById<Button>(R.id.btn_login)

        btn.setOnClickListener(){
            var intn = Intent(this,Home::class.java)
            startActivity(intn)

            if(username.equals("admin") && password.equals("admin123")){
                message.setText("Sucess..")
            }else{
                message.setText("Login Failed..")
            }

        }
    }
}