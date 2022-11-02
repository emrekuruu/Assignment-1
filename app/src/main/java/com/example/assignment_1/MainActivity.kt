package com.example.assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_1.Adapter.CompanyAdapter
import com.example.assignment_1.Data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.RecyclerView)

        val companies = DataSource(this).loadCompanies()
        recyclerView.adapter = CompanyAdapter(companies)

    }
}