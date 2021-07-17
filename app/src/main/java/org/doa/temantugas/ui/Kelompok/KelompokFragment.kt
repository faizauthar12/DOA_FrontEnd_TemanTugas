package org.doa.temantugas.ui.Kelompok

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.doa.temantugas.databinding.FragmentKelompokBinding

class KelompokFragment : Fragment() {
    private lateinit var binding: FragmentKelompokBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKelompokBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}