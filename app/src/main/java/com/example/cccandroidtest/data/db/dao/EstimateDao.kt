package com.example.cccandroidtest.data.db.dao

import androidx.room.*
import com.example.cccandroidtest.data.db.entities.DbEstimate
import kotlinx.coroutines.flow.Flow

/**
 *Author Parvinder Singh
 **/
@Dao
interface EstimateDao {
    @Insert
    suspend fun insertEstimate(dbEstimate: DbEstimate)

    @Query("SELECT * FROM estimate")
    fun getEstimate(): Flow<DbEstimate>

    @Query("DELETE FROM estimate")
    fun deleteEstimate()

    @Transaction
    suspend fun updateEstimate(dbEstimate: DbEstimate){
        deleteEstimate()
        insertEstimate(dbEstimate)
    }
}