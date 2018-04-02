package edu.rvc.student.restaurantreminder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PastRestaurantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_restaurant)

        val restList = findViewById<ListView>(R.id.restList)

    }
}
