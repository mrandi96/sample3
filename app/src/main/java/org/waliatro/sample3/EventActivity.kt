package org.waliatro.sample3

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        val myButton : Button = findViewById(R.id.button1);

        myButton.setOnClickListener(View.OnClickListener {
            myButton.text = "It works!";
        })
    }
}