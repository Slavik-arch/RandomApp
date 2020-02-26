package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, word!", Toast.LENGTH_LONG)

        myToast.show()
    }

    fun cauntMe(view: View) {
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, activity_second::class.java)
        val countString = textView.text.toString()
        val count: Int = Integer.parseInt(countString)
        randomIntent.putExtra(activity_second.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

}
