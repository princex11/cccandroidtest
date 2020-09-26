package com.example.cccandroidtest.data.db.mapper

import com.example.cccandroidtest.data.db.entities.DbEstimate
import com.example.cccandroidtest.data.db.entities.DbPerson
import com.example.cccandroidtest.domain.Estimate
import com.example.cccandroidtest.domain.Person
import javax.inject.Inject

/**
 *Author Parvinder Singh
 **/
class DbMapperImpl @Inject constructor() : DbMapper {

    override fun estimateToDbEstimate(estimate: Estimate): DbEstimate {
        return with(estimate) {
            DbEstimate(
                address,
                company,
                contact,
                createdBy,
                createdDate,
                id,
                number,
                requestedBy,
                revisionNumber
            )
        }
    }

    override fun personToDbPerson(person: Person): DbPerson {
        return with(person) {
            DbPerson(
                email, firstName, id, lastName, phoneNumber
            )
        }
    }

    override fun DbEstimateToEstimate(dbEstimate: DbEstimate): Estimate {
        return with(dbEstimate) {
            Estimate(
                address,
                company,
                contact,
                createdBy,
                createdDate,
                id,
                number,
                requestedBy,
                revisionNumber
            )
        }
    }

    override fun DbPersonToPerson(dbPerson: DbPerson): Person {
        return with(dbPerson) {
            Person(
                email, firstName, id, lastName, phoneNumber
            )
        }
    }
}