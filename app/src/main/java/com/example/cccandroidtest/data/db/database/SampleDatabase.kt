package com.example.cccandroidtest.data.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cccandroidtest.data.db.dao.EstimateDao
import com.example.cccandroidtest.data.db.dao.PersonDao
import com.example.cccandroidtest.data.db.entities.DbEstimate
import com.example.cccandroidtest.data.db.entities.DbPerson

/**
 *Author Parvinder Singh
 **/
@Database(entities = [DbEstimate::class, DbPerson::class], version = 1)
abstract class SampleDatabase: RoomDatabase() {

    abstract fun estimateDao(): EstimateDao
    abstract fun personDao(): PersonDao

}