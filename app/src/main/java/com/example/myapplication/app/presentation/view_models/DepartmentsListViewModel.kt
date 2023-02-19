package com.example.myapplication.app.presentation.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.source.local.Company
import com.example.myapplication.domain.usecases.GetCompaniesUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class DepartmentsListViewModel(private val getCompaniesUseCase: GetCompaniesUseCase) : ViewModel() {

    private var companies: Flow<List<Company>>? = null

    fun getCompanies() {
        viewModelScope.launch {
            companies = getCompaniesUseCase.execute()
        }
    }

}