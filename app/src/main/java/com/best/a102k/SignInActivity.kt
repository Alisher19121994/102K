package com.best.a102k

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity  : AppCompatActivity() {

    private val TAG = SignInActivity::class.java.toString()
    private var email_ID_sign_in: EditText? = null
    private var password_ID_sign_in: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        open()
    }

    private fun open() {
        email_ID_sign_in = findViewById(R.id.email_ID_sign_in)
        password_ID_sign_in = findViewById(R.id.password_ID_sign_in)

        val button = findViewById<Button>(R.id.button_ID_sign_in)
        button.setOnClickListener { openData() }

        val textView = findViewById<TextView>(R.id.text2_ID_sign_up)
        textView.setOnClickListener { getData() }
    }

    private fun openData() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun getData() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

}