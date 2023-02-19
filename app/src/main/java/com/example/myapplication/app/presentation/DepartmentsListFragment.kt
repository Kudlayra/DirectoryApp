package com.example.myapplication.app.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.app.app.DirectoryApp
import com.example.myapplication.app.presentation.view_models.DepartmentsListViewModel
import com.example.myapplication.app.presentation.view_models.ViewModelFactory
import com.example.myapplication.databinding.FragmentDepartmentsListBinding
import javax.inject.Inject


class DepartmentsListFragment : Fragment() {

    private var _binding: FragmentDepartmentsListBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: DepartmentsListViewModel by activityViewModels() {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDepartmentsListBinding.inflate(inflater, container, false)
        (requireContext().applicationContext as DirectoryApp).appComponent.inject(this)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getCompanies()
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_departments_list_fragment_to_add_downtime_fragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}