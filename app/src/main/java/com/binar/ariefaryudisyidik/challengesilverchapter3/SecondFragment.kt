package com.binar.ariefaryudisyidik.challengesilverchapter3

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.binar.ariefaryudisyidik.challengesilverchapter3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoToScreenThree.setOnClickListener {
            val inputName = binding.edtName.text.toString().trim()

            if (TextUtils.isEmpty(inputName)) {
                Toast.makeText(activity, "Field tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                val person = Person(name = inputName)
                findNavController().navigate(
                    SecondFragmentDirections.actionSecondFragmentToThirdFragment(person))
            }
        }
    }


}