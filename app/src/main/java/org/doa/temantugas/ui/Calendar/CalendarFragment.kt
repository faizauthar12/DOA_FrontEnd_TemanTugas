package org.doa.temantugas.ui.Calendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.doa.temantugas.databinding.FragmentCalendarBinding

class CalendarFragment : Fragment() {
    private lateinit var binding: FragmentCalendarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCalendarBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}