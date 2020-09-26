package com.example.cccandroidtest.domain

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 *Author Parvinder Singh
 **/
data class Person(
    val email: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val phoneNumber: String
)