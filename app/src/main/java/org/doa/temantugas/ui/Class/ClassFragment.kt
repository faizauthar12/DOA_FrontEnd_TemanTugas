package org.doa.temantugas.ui.Class

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import org.doa.temantugas.databinding.FragmentClassBinding

class ClassFragment : Fragment() {
    private lateinit var binding: FragmentClassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentClassBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val searchView = binding.searchView
            searchView.isIconifiedByDefault = false

            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[ClassViewModel::class.java]
            val courses = viewModel.getCourses()

            val classAdapter = ClassAdapter()
            classAdapter.setCourses(courses)

            with(binding.rvCourse) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = classAdapter
            }
        }
    }
}