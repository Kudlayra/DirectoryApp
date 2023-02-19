package com.example.myapplication.app.presentation.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.domain.usecases.GetCompaniesUseCase
import com.example.myapplication.domain.usecases.UpdateCompanyUseCase

class ViewModelFactory(
    private val getCompaniesUseCase: GetCompaniesUseCase,
    private val updateCompanyUseCase: UpdateCompanyUseCase,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DepartmentsListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DepartmentsListViewModel(getCompaniesUseCase = getCompaniesUseCase) as T
        }
        if (modelClass.isAssignableFrom(AddDowntimeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AddDowntimeViewModel(updateCompanyUseCase = updateCompanyUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}