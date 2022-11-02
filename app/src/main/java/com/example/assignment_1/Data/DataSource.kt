package com.example.assignment_1.Data

import android.content.Context
import com.example.assignment_1.R
import com.example.assignment_1.model.Company

class DataSource(val context: Context){

    fun getUserName():Array<String>{
        return context.resources.getStringArray(R.array.name_array)
    }

    fun getUserEmployeeNumber(): Array<String> {
        return context.resources.getStringArray(R.array.employeeNumber_array)
    }
    fun getRevenue(): Array<String> {
        return context.resources.getStringArray(R.array.revenue_array)
    }


    fun loadCompanies() : List<Company>{
        val companies = mutableListOf<Company>()
        val nameList = getUserName()
        val EmployeeNumList = getUserEmployeeNumber()
        val RevenueList = getRevenue()

        for (i in 0..50){
            val company = Company(nameList[i],EmployeeNumList[i],RevenueList[i])
            companies.add(company)
        }
        return companies
    }
}