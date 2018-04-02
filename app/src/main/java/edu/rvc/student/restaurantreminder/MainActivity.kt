package edu.rvc.student.restaurantreminder

import android.content.Context
import android.content.Context.*
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restName = findViewById<EditText>(R.id.txtRestName) as EditText
        val btnSubmit = findViewById<Button>(R.id.btnSubmit) as Button
        val btnRandom = findViewById<Button>(R.id.btnRandom) as Button
        val btnPast = findViewById<Button>(R.id.btnPastRest) as Button
        val viewTitle = findViewById<TextView>(R.id.txtViewTitle)
        val randomShow = findViewById<TextView>(R.id.txtRandomShow)
        val txtViewRating = findViewById<TextView>(R.id.txtViewRating)
        val txtInfo = findViewById<TextView>(R.id.txtViewInfo)
        val restList = findViewById<ListView>(R.id.restList)
        val preferences = getSharedPreferences ("data", Context.MODE_PRIVATE)

        btnSubmit.setOnClickListener{


        }




        btnPastRest.setOnClickListener{
            val intent = Intent(this, PastRestaurantActivity::class.java)
            startActivity(intent)
        }

    }
}
