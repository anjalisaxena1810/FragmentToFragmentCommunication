package com.example.fragmenttofragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmenttofragmentcommunication.databinding.TwoFragmentBinding

class FragmentTwo: Fragment() {
    private lateinit var twoFragmentBinding: TwoFragmentBinding
    private lateinit var mySharedViewModel: MySharedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         twoFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.two_fragment,container,false)
        mySharedViewModel=ViewModelProvider(requireActivity())[MySharedViewModel::class.java]
        return twoFragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mySharedViewModel.textmsg.observe(requireActivity(), Observer {
            twoFragmentBinding.result.text=it
        })
        super.onViewCreated(view, savedInstanceState)

    }
}