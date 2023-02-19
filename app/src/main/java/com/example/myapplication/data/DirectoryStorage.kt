package com.example.myapplication.data

import com.example.myapplication.data.source.local.Company
import kotlinx.coroutines.flow.Flow

interface DirectoryStorage {

    fun get(): Flow<List<Company>>

    fun update(company: Company): Boolean

}