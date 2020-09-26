package com.example.cccandroidtest.repository

import com.example.cccandroidtest.data.api.mapper.ApiMapper
import com.example.cccandroidtest.data.api.model.ApiModel
import com.example.cccandroidtest.data.db.dao.EstimateDao
import com.example.cccandroidtest.data.db.mapper.DbMapper
import com.example.cccandroidtest.domain.Estimate
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 *Author Parvinder Singh
 **/
class EstimateRepoImpl
    @Inject constructor(
        private val apiModel: ApiModel?,
        private val apiMapper: ApiMapper,
        private val dbMapper: DbMapper,
        private val estimateDao: EstimateDao
    ): EstimateRepo {
    override suspend fun getEstimate() {
        val response = apiModel?.apiEstimate
        val estimate = apiMapper.apiEstimateToDomainEstimate(response)
        if(estimate!=null){
            estimateDao.updateEstimate(dbMapper.estimateToDbEstimate(estimate))
        }
    }

    override fun getCacheEstimate(): Flow<Estimate> {
        return estimateDao.getEstimate().map { dbMapper.DbEstimateToEstimate(it) }
    }
}