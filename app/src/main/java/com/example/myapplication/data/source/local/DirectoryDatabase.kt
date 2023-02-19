package com.example.myapplication.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myapplication.data.source.local.utils.CompanyConverter

@Database(entities = arrayOf(Company::class), version = 1)
@TypeConverters(CompanyConverter::class)
abstract class DirectoryDatabase : RoomDatabase() {

    abstract fun departmentsDao(): DirectoryDao

    companion object {
        private var database: DirectoryDatabase? = null

        @Synchronized
        fun getInstance(context: Context): DirectoryDatabase {
            return if (database == null) {
                database =
                    Room.databaseBuilder(context,
                        DirectoryDatabase::class.java,
                        name = "directorydb")
                        .createFromAsset("database/directorydb.db")
                        .build()
                database as DirectoryDatabase
            } else {
                database as DirectoryDatabase
            }
        }
    }
}