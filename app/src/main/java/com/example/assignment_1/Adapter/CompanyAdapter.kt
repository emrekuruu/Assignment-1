package com.example.assignment_1.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_1.CompanyDetailActivity
import com.example.assignment_1.R
import com.example.assignment_1.model.Company


class
CompanyAdapter(val companies : List<Company>) : RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder>(){
    class CompanyViewHolder(val view : View) : RecyclerView.ViewHolder(view){
        val nameView : TextView = view.findViewById(R.id.companyNameItem)
        val Emp : TextView = view.findViewById(R.id.EmployeeNumberItem)
        lateinit var company : Company

        init {
            view.setOnClickListener{
                val show =Intent(itemView.context,CompanyDetailActivity::class.java)
                show.putExtra(COMPANY_KEY,company)
                itemView.context.startActivity(show)
            }

        }
        companion object{val COMPANY_KEY = "COMPANY"}
        fun bind(company: Company){
            this.company = company
            nameView.text = company.name
            Emp.text = company.employeeNumber
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view,
            parent,false)
        return CompanyAdapter.CompanyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val company = companies[position]
        holder.bind(company)
    }

    override fun getItemCount(): Int {
        return companies.size
    }
}