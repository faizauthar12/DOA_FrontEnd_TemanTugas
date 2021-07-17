package org.doa.temantugas.ui.Me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.doa.temantugas.databinding.FragmentMeBinding

class MeFragment : Fragment() {
    private lateinit var binding: FragmentMeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}