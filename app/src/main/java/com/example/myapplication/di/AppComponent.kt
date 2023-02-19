package com.example.myapplication.di

import com.example.myapplication.app.presentation.AddDowntimeFragment
import com.example.myapplication.app.presentation.DepartmentsListFragment
import dagger.Component

@Component(modules = [DataModule::class, AppModule::class, DomainModule::class])
interface AppComponent {

    fun inject(departmentsListFragment: DepartmentsListFragment)
    fun inject(addDowntimeFragment: AddDowntimeFragment)

}