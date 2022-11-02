package com.example.assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.assignment_1.databinding.ActivityCompanyDetailBinding
import com.example.assignment_1.model.Company


class CompanyDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityCompanyDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_company_detail)
        val selectedCompany =intent.getSerializableExtra("COMPANY") as Company
        binding.company = selectedCompany
    }
}