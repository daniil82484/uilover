package com.example.uilover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val item_res:RecyclerView = findViewById(R.id.rec_view)
        item_res.adapter = Item_adapter(this, ItemList().list)
    }
}