package com.example.gate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class SemFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sem, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var sem1: Button = view.findViewById(R.id.Firstbtn)
        var sem2: Button = view.findViewById(R.id.Secondbtn)
        var sem3: Button = view.findViewById(R.id.Thirdbtn)
        var sem4: Button = view.findViewById(R.id.Fourthbtn)
        var sem5: Button = view.findViewById(R.id.Fifthbtn)
        var sem6: Button = view.findViewById(R.id.Sixthbtn)
        var navController = Navigation.findNavController(view)

        sem1.setOnClickListener {
         KEY.SEM = "1"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
        sem2.setOnClickListener {
            KEY.SEM = "2"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
        sem3.setOnClickListener {
            KEY.SEM = "3"
            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
        sem4.setOnClickListener {
            KEY.SEM = "4"
            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
        sem5.setOnClickListener {
            KEY.SEM = "5"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
        sem6.setOnClickListener {
            KEY.SEM = "6"
            Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//            navController.navigate(R.id.action_semFragment2_to_subjectsFragment)
        }
    }
}