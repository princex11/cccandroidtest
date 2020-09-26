package com.example.cccandroidtest.data.api.mapper

import com.example.cccandroidtest.data.api.model.ApiEstimate
import com.example.cccandroidtest.data.api.model.ApiModel
import com.example.cccandroidtest.data.api.model.ApiPerson
import com.example.cccandroidtest.domain.Estimate
import com.example.cccandroidtest.domain.Model
import com.example.cccandroidtest.domain.Person

/**
 *Author Parvinder Singh
 **/
interface ApiMapper {

    fun apiModelToDomainModel(apiModel: ApiModel?): Model
    fun apiEstimateToDomainEstimate(apiEstimate: ApiEstimate?): Estimate
    fun apiPersonToDomainPerson(apiPerson: ApiPerson?): Person

}