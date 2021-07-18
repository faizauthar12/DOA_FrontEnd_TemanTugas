package org.doa.temantugas.ui.Kelompok

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val courseId = arguments?.getString("courseId")
            Log.d("KelompokFragment", "gotcha!!! ${courseId}")
        }
    }
}