package com.example.gate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class BranchFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_branch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var csebtn: Button = view.findViewById(R.id.csebtn)
        var cebtn: Button = view.findViewById(R.id.cebtn)
        var eeebtn: Button = view.findViewById(R.id.eeebtn)
        var mebtn: Button = view.findViewById(R.id.mebtn)
        var navController = Navigation.findNavController(view)


        csebtn.setOnClickListener {
            KEY.BRANCH = "CSE"
            navController.navigate(R.id.action_branchFragment_to_semFragment22)
        }

        cebtn.setOnClickListener {
            KEY.BRANCH = "CE"
            navController.navigate(R.id.action_branchFragment_to_semFragment22)
        }

        eeebtn.setOnClickListener {
            KEY.BRANCH = "EEE"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_branchFragment_to_semFragment22)
        }

        mebtn.setOnClickListener {
            KEY.BRANCH = "ME"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_branchFragment_to_semFragment22)
        }
    }
}
