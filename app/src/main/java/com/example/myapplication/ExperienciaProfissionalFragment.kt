package com.example.myapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentExperienciaProfissionalBinding

class ExperienciaProfissionalFragment : Fragment() {

    private var _binding: FragmentExperienciaProfissionalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ExperienciaProfissionalViewModel =
            ViewModelProvider(this).get(ExperienciaProfissionalViewModel::class.java)

        _binding = FragmentExperienciaProfissionalBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

