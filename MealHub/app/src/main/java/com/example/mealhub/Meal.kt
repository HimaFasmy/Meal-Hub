package com.example.mealhub

import androidx.room.*

@Entity(tableName = "meal")
@TypeConverters(ListStringConverter::class)
data class Meal(
    val idMeal: String,
    @PrimaryKey
    val meal: String,
    val drinkAlternate: String?,
    val category: String,
    val area: String,
    val instructions: String,
    val mealThumb: String?,
    val tags: String?,
    val youtube: String?,
    val ingredients: List<String>,
    val measures: List<String>,
    val source: String?,
    val imageSource: String?,
    val creativeCommonsConfirmed: String?,
    val dateModified: String?
) {

}