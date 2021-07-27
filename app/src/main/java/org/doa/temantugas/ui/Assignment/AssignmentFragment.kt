package org.doa.temantugas.ui.Assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import org.doa.temantugas.databinding.FragmentAssignmentBinding
import org.doa.temantugas.ui.CourseDetail.CourseDetailSharedViewModel

class AssignmentFragment : Fragment() {
    private lateinit var binding: FragmentAssignmentBinding
    private val viewModel: CourseDetailSharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAssignmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val assignments = viewModel.getAssignments()

            val assignmentAdapter = AssignmentAdapter()
            assignmentAdapter.setAssignment(assignments)

            with(binding.rvAssignment) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = assignmentAdapter
            }
        }
    }
}