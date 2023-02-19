package com.example.myapplication.domain.repository

import com.example.myapplication.data.source.local.Company
import kotlinx.coroutines.flow.Flow

interface DirectoryRepository {

    suspend fun getCompanies(): Flow<List<Company>>

    suspend fun updateCompany(company: Company): Boolean

}