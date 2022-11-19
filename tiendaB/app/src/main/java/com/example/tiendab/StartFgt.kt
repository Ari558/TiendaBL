package com.example.tiendab

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class StartFgt : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start_fgt , container, false)
    }

    companion object {

    }
}