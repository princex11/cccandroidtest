package com.example.cccandroidtest.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.cccandroidtest.data.db.entities.DbPerson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.selects.select

/**
 *Author Parvinder Singh
 **/
@Dao
interface PersonDao {

    @Insert
    suspend fun insertPerson(dbPerson: DbPerson)

    @Query("DELETE FROM person")
    fun delete()

    @Query("SELECT * FROM person WHERE id LIKE :id")
    fun getPerson(id: String): Flow<DbPerson>

    @Transaction
    suspend fun updatePerson(dbPerson: DbPerson){
        delete()
        insertPerson(dbPerson)
    }

}