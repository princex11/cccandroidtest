package com.example.cccandroidtest.ui.fragments

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.cccandroidtest.data.db.mapper.DbMapper
import com.example.cccandroidtest.domain.Person
import com.example.cccandroidtest.repository.EstimateRepo
import com.example.cccandroidtest.repository.PersonRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

class MainViewModel @ViewModelInject constructor(
    private val estimateRepo: EstimateRepo,
    private val personRepo: PersonRepo
) : ViewModel() {

    fun setUpData() {
        viewModelScope.launch(Dispatchers.IO) {
            estimateRepo.getEstimate()
            personRepo.getPerson()
        }
    }

    val estimate = estimateRepo.getCacheEstimate().asLiveData(
        viewModelScope.coroutineContext
    )


    fun personDetail(id: String): LiveData<Person> {
        return personRepo.getCachePerson(id).asLiveData(
            viewModelScope.coroutineContext
        )
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}