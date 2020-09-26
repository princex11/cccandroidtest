package com.example.cccandroidtest.repository

import com.example.cccandroidtest.domain.Estimate
import kotlinx.coroutines.flow.Flow

/**
 *Author Parvinder Singh
 **/
interface EstimateRepo {

   suspend fun getEstimate()
   fun getCacheEstimate(): Flow<Estimate>
}