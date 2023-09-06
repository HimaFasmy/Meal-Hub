package com.example.mealhub

import android.database.Cursor
import androidx.room.*

@Dao
interface MealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(meal: Meal)

    @Query("SELECT * FROM meal WHERE meal = :mealName")
    suspend fun getMealByName(mealName: String): List<Meal>

    @Query("SELECT * FROM meal")
    suspend fun getAllMeal(): List<Meal>
}

//@Dao
//interface MealDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertMeal(meal: Meal)
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertAllMeals(meals: List<Meal>)
//
//    @Update
//    suspend fun updateMeal(meal: Meal)
//
//    @Delete
//    suspend fun deleteMeal(meal: Meal)
//
//    @Query("SELECT * FROM meal")
//    suspend fun getAllMeal(): List<Meal>
//
//
//}
