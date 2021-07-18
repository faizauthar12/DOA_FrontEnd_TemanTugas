package org.doa.temantugas.ui.Tugas

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import org.doa.temantugas.databinding.FragmentTugasBinding

class TugasFragment : Fragment() {
    private lateinit var binding: FragmentTugasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTugasBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val courseId = arguments?.getString("courseId")
            Log.d("TugasFragment", "gotcha!!! ${courseId}")

            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TugasViewModel::class.java]
            val assignments = viewModel.getAssignments()

            val tugasAdapter = TugasAdapter()
            tugasAdapter.setAssignment(assignments)

            with(binding.rvAssignment) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tugasAdapter
            }
        }
    }
}