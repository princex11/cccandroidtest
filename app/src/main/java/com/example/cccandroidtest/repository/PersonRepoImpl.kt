package com.example.cccandroidtest.repository

import android.util.Log
import com.example.cccandroidtest.data.api.mapper.ApiMapper
import com.example.cccandroidtest.data.api.model.ApiModel
import com.example.cccandroidtest.data.db.dao.PersonDao
import com.example.cccandroidtest.data.db.entities.DbPerson
import com.example.cccandroidtest.data.db.mapper.DbMapper
import com.example.cccandroidtest.domain.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 *Author Parvinder Singh
 **/
class PersonRepoImpl @Inject constructor(
   private val apiModel: ApiModel?,
   private val apiMapper: ApiMapper,
   private val dbMapper: DbMapper,
   private val personDao: PersonDao
) : PersonRepo {

    override suspend fun getPerson() {
        val apiPerson = apiModel?.apiPerson
        val person = apiMapper.apiPersonToDomainPerson(apiPerson)
        personDao.updatePerson(dbMapper.personToDbPerson(person))
    }

    override fun getCachePerson(id: String): Flow<Person> {
      val p =   personDao.getPerson(id).map { dbMapper.DbPersonToPerson(it) }
        return p
    }
}