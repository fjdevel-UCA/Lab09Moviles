package com.example.laboratorio09

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.corutinesdemo.R
import com.example.corutinesdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configura el listener de click para el botón
        binding.mainThreadButton.setOnClickListener {
            // Inicia MainThreadFragment cuando se presiona el botón
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, MainThreadFragment())
                .addToBackStack(null) // Agrega la transacción a la pila de retorno
                .commit()
        }

        // Configura el listener de click para el botón coroutines_button
        binding.coroutinesButton.setOnClickListener {
            // Inicia CoroutinesFragment cuando se presiona el botón
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, CoroutinesFragment())
                .addToBackStack(null) // Agrega la transacción a la pila de retorno
                .commit()
        }

        //TODO: Use binding to navigate to the other fragments
    }


}