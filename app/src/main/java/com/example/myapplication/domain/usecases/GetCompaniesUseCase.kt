package com.example.myapplication.domain.usecases

import com.example.myapplication.data.source.local.Company
import com.example.myapplication.domain.repository.DirectoryRepository
import kotlinx.coroutines.flow.Flow

class GetCompaniesUseCase(private val directoryRepository: DirectoryRepository) {

    suspend fun execute(): Flow<List<Company>> {
        return directoryRepository.getCompanies()
    }

}