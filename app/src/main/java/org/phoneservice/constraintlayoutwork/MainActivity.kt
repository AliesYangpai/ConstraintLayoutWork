package org.phoneservice.constraintlayoutwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn7 = findViewById(R.id.btn7)
        btn7.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
