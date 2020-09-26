package com.example.cccandroidtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cccandroidtest.R
import com.example.cccandroidtest.databinding.MainFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        viewModel.setUpData()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.estimate.observe(viewLifecycleOwner, { estimate ->
            estimate?.let {
                binding.estimate = estimate
                viewModel.personDetail(estimate.createdBy).observe(viewLifecycleOwner,{person->
                    person?.let {
                        binding.person=person
                        binding.executePendingBindings()
                    }
                })
            }
        })
    }
}