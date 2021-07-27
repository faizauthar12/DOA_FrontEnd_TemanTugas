package org.doa.temantugas.ui.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import org.doa.temantugas.R
import org.doa.temantugas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            /* Avatar Glide*/
            Glide.with(this)
                .load(R.drawable.avatar_dummy)
                .centerCrop()
                .override(52)
                .transform(RoundedCorners(20))
                .into(binding.ivProfileHome)

            /* Dummy Percentage Glide */
            Glide.with(this)
                .load(R.drawable.percentage_dummy)
                .into(binding.ivPercentageHome)

            /* Set percentage title */
            binding.tvPrecentageTitle.text = "Presentase Tugas Mingguan"
        }
    }
}