package com.example.fragmenttofragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fragmenttofragmentcommunication.databinding.OneFragmentBinding

class FragmentOne: Fragment() {
    private lateinit var mySharedViewModel: MySharedViewModel
    private lateinit var oneFragmentBinding: OneFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        oneFragmentBinding= DataBindingUtil.inflate(inflater,R.layout.one_fragment,container,false)

        oneFragmentBinding.btnSubmit.setOnClickListener {
            mySharedViewModel.SetText(oneFragmentBinding.etInput.text.toString())
        }
        return oneFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mySharedViewModel=ViewModelProvider(requireActivity())[MySharedViewModel::class.java]
    }

}