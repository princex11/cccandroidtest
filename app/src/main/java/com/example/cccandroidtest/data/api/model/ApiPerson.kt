package com.example.cccandroidtest.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiPerson(
    @Json(name = "email")
    val email: String? = null,
    @Json(name = "first_name")
    val firstName: String? = null,
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "last_name")
    val lastName: String? = null,
    @Json(name = "phone_number")
    val phoneNumber: String? = null
)