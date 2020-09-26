package com.example.cccandroidtest.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cccandroidtest.R
import com.example.cccandroidtest.databinding.ActivityMainBinding
import com.example.cccandroidtest.repository.EstimateRepo
import com.example.cccandroidtest.repository.PersonRepo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var personRepo: PersonRepo

    @Inject
    lateinit var estimateRepo: EstimateRepo

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}