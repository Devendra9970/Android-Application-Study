package com.devendra.texttospeech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSpeak=findViewById<Button>(R.id.btn1)
        var editTextField=findViewById<EditText>(R.id.editTextText)

        tts= TextToSpeech(applicationContext.textto)

        btnSpeak.setOnClickListener{
            var.text=editTextField.text
            Toast.makeText(, this, Toast.LENGTH_SHORT).show()
        }
    }
}