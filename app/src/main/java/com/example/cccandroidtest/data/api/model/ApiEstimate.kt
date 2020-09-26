package com.example.cccandroidtest.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiEstimate(
    @Json(name = "address")
    val address: String? = null,
    @Json(name = "company")
    val company: String? = null,
    @Json(name = "contact")
    val contact: String? = null,
    @Json(name = "created_by")
    val createdBy: String? = null,
    @Json(name = "created_date")
    val createdDate: String? = null,
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "number")
    val number: Int? = null,
    @Json(name = "requested_by")
    val requestedBy: String? = null,
    @Json(name = "revision_number")
    val revisionNumber: Int? = null
)