package com.example.mealhub

import android.content.Context
import androidx.room.*

object DatabaseProvider {
    private const val DATABASE_NAME = "meal_database"

    private var instance: AppDatabase? = null

     fun getInstance(context: Context): AppDatabase {
        return instance ?: synchronized(this) {
            val db = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DATABASE_NAME
            ).build()
            instance = db
            db


        }


    }

}