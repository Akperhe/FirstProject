package com.ogheneovo.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validUsername : String ="admin"
    val validPassword : String ="admin"

    private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var submitButton : Button //j.son backend framework

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput =findViewById(R.id.usernameInput)
        passwordInput =findViewById(R.id.passwordInput)
        submitButton =findViewById(R.id.submitButton)
        // here we introduce a lambda function a func thats declear and call at same time
        submitButton.setOnClickListener {
            val userName =usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(userName,password)
        }
    }

    private  fun login(username: String, password: String){
        if(isValidCredentials(username,password)){
            val intent : Intent = Intent(this,HomeActivity::class.java)// this pass a reference of the class
            //intent open system service or open new activity
            intent.putExtra("name", username)// to supply new information to the new activity the name is and identifier
            startActivity(intent)
        } else{
            //new widget called toast
            Toast.makeText(applicationContext, "Something went wrong", Toast.LENGTH_LONG).show()
        }

    }

    private fun isValidCredentials(username: String, password: String) : Boolean{
        if (username==validUsername && password==validPassword) return true
        return false
       // return (username==validUsername && password==validPassword)

    }

}