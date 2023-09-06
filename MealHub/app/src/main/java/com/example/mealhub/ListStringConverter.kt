package com.example.mealhub

import androidx.room.*

class ListStringConverter {

    @TypeConverter
    fun fromList(list: List<String>): String {
        return list.joinToString(separator = ",")
    }

    @TypeConverter
    fun toList(value: String): List<String> {
        return value.split(",").map { it.trim() }
    }
}