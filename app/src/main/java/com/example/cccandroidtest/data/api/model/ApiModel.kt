package com.example.cccandroidtest.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiModel(
    @Json(name = "estimate")
    val apiEstimate: ApiEstimate? = null,
    @Json(name = "person")
    val apiPerson: ApiPerson? = null
)