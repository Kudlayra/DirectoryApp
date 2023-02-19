package com.example.myapplication.domain.usecases

import com.example.myapplication.data.source.local.Company
import com.example.myapplication.domain.repository.DirectoryRepository

class UpdateCompanyUseCase(private val directoryRepository: DirectoryRepository) {

    suspend fun execute(company: Company): Boolean {
        return directoryRepository.updateCompany(company = company)
    }

}