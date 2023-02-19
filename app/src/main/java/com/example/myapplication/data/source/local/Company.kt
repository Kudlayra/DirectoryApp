package com.example.myapplication.data.source.local

import androidx.room.*
import com.example.myapplication.data.models.Department
import com.example.myapplication.data.source.local.utils.CompanyConverter

@Entity(tableName = "directorydb")
data class Company(
    @PrimaryKey
    @ColumnInfo("company_name")
    val companyName: String,
    @ColumnInfo("departments_list")
    @TypeConverters(CompanyConverter::class)
    val departmentsList: List<Department>? = null,
)
