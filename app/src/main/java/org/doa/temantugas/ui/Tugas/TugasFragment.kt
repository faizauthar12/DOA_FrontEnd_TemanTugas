package org.doa.temantugas.ui.Tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
}