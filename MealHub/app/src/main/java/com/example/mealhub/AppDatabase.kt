package com.example.mealhub

import android.content.Context
import androidx.room.*

@Database(entities = [Meal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun mealDao(): MealDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "meal_database"
                ).build()
            }
            return INSTANCE as AppDatabase
        }
    }
}