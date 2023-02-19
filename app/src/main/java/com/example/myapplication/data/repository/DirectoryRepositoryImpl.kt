package com.example.myapplication.data.repository

import com.example.myapplication.data.DirectoryStorage
import com.example.myapplication.data.source.local.Company
import com.example.myapplication.domain.repository.DirectoryRepository
import kotlinx.coroutines.flow.Flow

class DirectoryRepositoryImpl(private val directoryStorage: DirectoryStorage) : DirectoryRepository {

    override suspend fun getCompanies(): Flow<List<Company>> {
        return directoryStorage.get()
    }

    override suspend fun updateCompany(company: Company): Boolean {
        return directoryStorage.update(company)
    }

}