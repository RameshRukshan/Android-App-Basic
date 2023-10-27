package com.example.androidappdemol1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class member_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_dashboard)

        var output_fName = intent.getStringExtra("first_name")
        var output_lName = intent.getStringExtra("last_name")

        findViewById<TextView>(R.id.lbl_lastName).setText(output_lName)
        findViewById<TextView>(R.id.lbl_welcomeMessage).setText("Welcome $output_fName $output_lName to the Toyota")
        findViewById<TextView>(R.id.lbl_full_name).setText("$output_fName $output_lName")

        findViewById<TextView>(R.id.lbl_email).setText(intent.getStringExtra("email"))
        findViewById<TextView>(R.id.lbl_tellNum).setText(intent.getStringExtra("tel"))

    }
}