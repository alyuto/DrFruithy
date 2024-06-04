package com.dicoding.drfruithy.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.dicoding.drfruithy.R
import com.dicoding.drfruithy.databinding.FragmentHomeBinding
import com.dicoding.drfruithy.ui.detect.ChooseDetectActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as AppCompatActivity).supportActionBar?.title = "Home"
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.apply {
            detect.setOnClickListener{ chooseDetect()}
            articleSeeAll.setOnClickListener { article() }
        }

        return root
    }

    private fun article() {
        val navOptions = NavOptions.Builder()
            .setPopUpTo(R.id.navigation_home, true)
            .build()
        findNavController().navigate(R.id.navigation_article, null, navOptions)
    }

    private fun chooseDetect() {
        val intentDetect = Intent(requireContext(), ChooseDetectActivity::class.java)
        startActivity(intentDetect)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}