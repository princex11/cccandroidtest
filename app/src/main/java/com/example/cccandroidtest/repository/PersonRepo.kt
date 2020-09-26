package com.example.cccandroidtest.repository

import com.example.cccandroidtest.data.db.entities.DbPerson
import com.example.cccandroidtest.domain.Person
import kotlinx.coroutines.flow.Flow

/**
 *Author Parvinder Singh
 **/
interface PersonRepo {
    suspend fun getPerson()
    fun getCachePerson(id: String):Flow<Person>
}