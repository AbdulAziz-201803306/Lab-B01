package com.example.midterm

import android.content.Context
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString
object visitRepository{
    var visits = listOf<Visit>()
    fun initVisits(context: Context){
        var data = context.assets.open("visits.jason").bufferedReader().use { it.readText() }
        visits = Json { ignoreUnknownKeys = true }.decodeFromString(data)
    }

}