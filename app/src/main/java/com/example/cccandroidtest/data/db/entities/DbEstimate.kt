package com.example.cccandroidtest.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *Author Parvinder Singh
 **/
@Entity(tableName = "estimate")
data class DbEstimate(
    val address: String,
    val company: String,
    val contact: String,
    val createdBy: String,
    val createdDate: String,
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val number: Int,
    val requestedBy: String,
    val revisionNumber: Int
)