package com.ogheneovo.firstproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private  lateinit var usernameDisplay: TextView

    // the previous activity that open this class is always available to be used here
    // meaning it global and is avaliable to this class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.userNameDisplay)
        //usernameDisplay.text = "Hello people"
        //usernameDisplay.text = intent.getStringExtra("name")
        usernameDisplay.text = "welcome, ${intent.getStringExtra("name")}"
        // am using curling brace because am calling an expression not a sigular value
        // git init the folder and clone from url of repo
    }
}