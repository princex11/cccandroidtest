package com.example.cccandroidtest.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *Author Parvinder Singh
 **/
@Entity (tableName = "person")
data class DbPerson (

    val email: String,
    val firstName: String,

    @PrimaryKey(autoGenerate = false)
    val id: String,

    val lastName: String,
    val phoneNumber: String
    )