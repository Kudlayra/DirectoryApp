package com.example.myapplication.app.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.app.app.DirectoryApp
import com.example.myapplication.app.presentation.view_models.AddDowntimeViewModel
import com.example.myapplication.app.presentation.view_models.ViewModelFactory
import com.example.myapplication.databinding.FragmentAddDowntimeBinding
import javax.inject.Inject

class AddDowntimeFragment : Fragment() {

    private var _binding: FragmentAddDowntimeBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: AddDowntimeViewModel by viewModels() {
        viewModelFactory
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddDowntimeBinding.inflate(inflater, container, false)
        (requireContext().applicationContext as DirectoryApp).appComponent.inject(this)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}