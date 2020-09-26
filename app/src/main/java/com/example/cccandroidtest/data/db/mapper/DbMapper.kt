package com.example.cccandroidtest.data.db.mapper

import com.example.cccandroidtest.data.db.entities.DbEstimate
import com.example.cccandroidtest.data.db.entities.DbPerson
import com.example.cccandroidtest.domain.Estimate
import com.example.cccandroidtest.domain.Person

/**
 *Author Parvinder Singh
 **/
interface DbMapper {

    fun estimateToDbEstimate(estimate: Estimate): DbEstimate
    fun personToDbPerson(person: Person): DbPerson

    fun DbEstimateToEstimate(dbEstimate: DbEstimate): Estimate
    fun DbPersonToPerson(dbPerson: DbPerson): Person

}