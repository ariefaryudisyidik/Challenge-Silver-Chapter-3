package com.binar.ariefaryudisyidik.challengesilverchapter3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.binar.ariefaryudisyidik.challengesilverchapter3.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {
    private lateinit var binding: FragmentFourthBinding
    private val arguments: FourthFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFourthBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoToScreenThree.setOnClickListener {
            val name = arguments.name
            val age = binding.edtAge.text.toString().trim()
            val address = binding.edtAddress.text.toString().trim()
            val profession = binding.edtProfession.text.toString().trim()

            if (age.isNullOrEmpty() || address.isNullOrEmpty() || profession.isNullOrEmpty()) {
                Toast.makeText(activity, "Field tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                val person = Person(
                    name = name,
                    age = age.toInt(),
                    address = address,
                    profession = profession
                )
                findNavController().navigate(
                    FourthFragmentDirections.actionFourthFragmentToThirdFragment(person)
                )
            }
        }
    }
}