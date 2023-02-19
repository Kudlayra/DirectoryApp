package com.example.myapplication.app.presentation.view_models

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.source.local.Company
import com.example.myapplication.domain.usecases.UpdateCompanyUseCase

class AddDowntimeViewModel(private val updateCompanyUseCase: UpdateCompanyUseCase) : ViewModel() {

    suspend fun updateCompany(company: Company) {
        updateCompanyUseCase.execute(company = company)
    }

}