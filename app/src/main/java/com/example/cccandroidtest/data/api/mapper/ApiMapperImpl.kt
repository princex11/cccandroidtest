package com.example.cccandroidtest.data.api.mapper

import com.example.cccandroidtest.data.api.model.ApiEstimate
import com.example.cccandroidtest.data.api.model.ApiModel
import com.example.cccandroidtest.data.api.model.ApiPerson
import com.example.cccandroidtest.domain.Estimate
import com.example.cccandroidtest.domain.Model
import com.example.cccandroidtest.domain.Person
import javax.inject.Inject

/**
 *Author Parvinder Singh
 **/
class ApiMapperImpl @Inject constructor() : ApiMapper {

    override fun apiModelToDomainModel(apiModel: ApiModel?): Model {
        return with(apiModel){
            Model(
                estimate = apiEstimateToDomainEstimate(this?.apiEstimate),
                person = apiPersonToDomainPerson(this?.apiPerson)
            )
        }
    }

    override fun apiEstimateToDomainEstimate(apiEstimate: ApiEstimate?): Estimate {
       return with(apiEstimate!!){
           Estimate(
               address!!,
               company!!,
               contact!!,
               createdBy!!,
               createdDate!!,
               id!!,
               number!!,
               requestedBy!!,
               revisionNumber!!
           )
       }
    }

    override fun apiPersonToDomainPerson(apiPerson: ApiPerson?): Person {
        return with(apiPerson!!){
            Person(
                email!!,
                firstName!!,
                id!!,
                lastName!!,
                phoneNumber!!
            )
        }
    }

}


