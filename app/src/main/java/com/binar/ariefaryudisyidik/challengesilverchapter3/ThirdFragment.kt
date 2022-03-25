package com.binar.ariefaryudisyidik.challengesilverchapter3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.binar.ariefaryudisyidik.challengesilverchapter3.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private val arguments: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments.person.name
        val age = arguments.person.age
        val address = arguments.person.address
        val profession = arguments.person.profession

        if (age == null && address == null && profession == null) {
            binding.tvInfo.text = name
        } else {
            if (age!! % 2 == 0) {
                binding.tvInfo.text = "$name\n" +
                        "$age, Genap\n" +
                        "$address\n" +
                        "$profession"
            } else {
                binding.tvInfo.text = "$name\n" +
                        "$age, Ganjil\n" +
                        "$address\n" +
                        "$profession"
            }
        }

        binding.btnGoToScreenFour.setOnClickListener {
            findNavController().navigate(
                ThirdFragmentDirections.actionThirdFragmentToFourthFragment(name.toString())
            )
        }
    }
}