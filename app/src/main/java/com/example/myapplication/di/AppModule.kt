package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.app.presentation.view_models.ViewModelFactory
import com.example.myapplication.domain.usecases.GetCompaniesUseCase
import com.example.myapplication.domain.usecases.UpdateCompanyUseCase
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideViewModelFactory(
        getCompaniesUseCase: GetCompaniesUseCase,
        updateCompanyUseCase: UpdateCompanyUseCase,
    ): ViewModelFactory {
        return ViewModelFactory(getCompaniesUseCase = getCompaniesUseCase,
            updateCompanyUseCase = updateCompanyUseCase)
    }

}