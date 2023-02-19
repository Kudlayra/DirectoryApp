package com.example.myapplication.di

import com.example.myapplication.domain.repository.DirectoryRepository
import com.example.myapplication.domain.usecases.GetCompaniesUseCase
import com.example.myapplication.domain.usecases.UpdateCompanyUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideGetCompaniesUseCase(directoryRepository: DirectoryRepository): GetCompaniesUseCase {
        return GetCompaniesUseCase(directoryRepository = directoryRepository)
    }

    @Provides
    fun provideUpdateCompanyUseCase(directoryRepository: DirectoryRepository): UpdateCompanyUseCase {
        return UpdateCompanyUseCase(directoryRepository = directoryRepository)
    }

}