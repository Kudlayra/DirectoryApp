package com.example.myapplication.data.source.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface DirectoryDao {

    @Query("SELECT * FROM directorydb")
    fun getAllDepartments(): Flow<List<Company>>

    @Update(Company::class)
    fun updateDepartment(company: Company)

}