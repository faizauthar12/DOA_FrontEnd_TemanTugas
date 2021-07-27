package org.doa.temantugas.ui.Assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.doa.temantugas.databinding.FragmentAssignmentBinding

class AssignmentFragment : Fragment() {
    private lateinit var binding: FragmentAssignmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAssignmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}