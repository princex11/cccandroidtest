package com.example.cccandroidtest.domain

import com.squareup.moshi.Json

/**
 *Author Parvinder Singh
 **/
data class Estimate(
    val address: String,
    val company: String,
    val contact: String,
    val createdBy: String,
    val createdDate: String,
    val id: String,
    val number: Int,
    val requestedBy: String,
    val revisionNumber: Int
)