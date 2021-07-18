package org.doa.temantugas.ui.Tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import org.doa.temantugas.databinding.FragmentTugasBinding
import org.doa.temantugas.ui.CourseDetail.CourseDetailViewModel

class TugasFragment : Fragment() {
    private lateinit var binding: FragmentTugasBinding
    private val viewModel: CourseDetailViewModel by activityViewModels()

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
            val assignments = viewModel.getAssignment()

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