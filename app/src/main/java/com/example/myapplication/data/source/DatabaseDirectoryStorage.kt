package com.example.myapplication.data.source

import com.example.myapplication.data.DirectoryStorage
import com.example.myapplication.data.source.local.Company
import com.example.myapplication.data.source.local.DirectoryDatabase
import kotlinx.coroutines.flow.Flow

class DatabaseDirectoryStorage(private val database: DirectoryDatabase) : DirectoryStorage {

    override fun get(): Flow<List<Company>> {
        return database.departmentsDao().getAllDepartments()
    }

    override fun update(company: Company): Boolean {
        database.departmentsDao().updateDepartment(company)
        return true
    }

}