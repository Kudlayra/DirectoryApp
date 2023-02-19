package com.example.myapplication.data.source.local.utils

import androidx.room.TypeConverter
import com.example.myapplication.data.models.Department
import com.example.myapplication.data.source.local.Company
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CompanyConverter {

    @TypeConverter
    fun fromCompany(value: List<Department>?): String? {
        val type = object : TypeToken<List<Company>>(){}.type
        return value?.let { Gson().toJson(type) }
    }

    @TypeConverter
    fun toCompany(value: String?): List<Department>? {
        val type = object : TypeToken<List<Company>>(){}.type
        return value?.let { Gson().fromJson(value, type) }
    }

}