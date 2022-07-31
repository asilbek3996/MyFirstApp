package eu.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttunclicked = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)
        var timecliced = 0
        buttunclicked.setOnClickListener {
            timecliced += 1
            textview.text = timecliced.toString()
        }

    }
}