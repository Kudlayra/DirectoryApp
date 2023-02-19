package com.example.myapplication.data.models

data class Sector(
    val name: String,
    val downtimeType: String,
    val downtimeTime: DowntimeTime,
    val site: String,
    val reason: String,
    val equipment: String,
)