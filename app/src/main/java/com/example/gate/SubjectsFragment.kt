package com.example.gate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class SubjectsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_subjects, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var sub1: Button = view.findViewById(R.id.subject1)
        var sub2: Button = view.findViewById(R.id.subject2)
        var sub3: Button = view.findViewById(R.id.subject3)
        var sub4: Button = view.findViewById(R.id.subject4)
        var sub5: Button = view.findViewById(R.id.subject5)

        var navController = Navigation.findNavController(view)

        if (KEY.BRANCH == "CSE") {
            if (KEY.SEM == "3") {

                sub1.text="Maths"
                sub2.text="D S A"
                sub3.text="Digital Electronics"
                sub4.text="Python & Django"
                sub5.text="Operating System"

                sub1.setOnClickListener {
                    KEY.SUBJECT = "Subject1"
                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub2.setOnClickListener {
                    KEY.SUBJECT = "Subject2"
                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub3.setOnClickListener {
                    KEY.SUBJECT = "Subject3"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub4.setOnClickListener {
                    KEY.SUBJECT = "Subject4"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub5.setOnClickListener {
                    KEY.SUBJECT = "Subject5"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
            }

            if (KEY.SEM == "4") {

                sub1.text="Computer Organisation & Architecture"
                sub2.text="Discrete Mathematical Structures"
                sub3.text="Oops with Java"
                sub4.text="D M S"
                sub5.text="Theory of Comutation"

                sub1.setOnClickListener {
                    KEY.SUBJECT = "Subject1"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub2.setOnClickListener {
                    KEY.SUBJECT = "Subject2"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub3.setOnClickListener {
                    KEY.SUBJECT = "Subject3"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub4.setOnClickListener {
                    KEY.SUBJECT = "Subject4"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub5.setOnClickListener {
                    KEY.SUBJECT = "Subject5"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
            }
        }

        if (KEY.BRANCH == "CE") {
            if (KEY.SEM == "3") {

                sub1.text="Maths"
                sub2.text="Engineering Mechanics"
                sub3.text="Introduction to Mechanics"
                sub4.text="Survey & Geomatics"
                sub5.text="Material Testing & Evaluation"

                sub1.setOnClickListener {
                    KEY.SUBJECT = "Subject1"
                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub2.setOnClickListener {
                    KEY.SUBJECT = "Subject2"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub3.setOnClickListener {
                    KEY.SUBJECT = "Subject3"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub4.setOnClickListener {
                    KEY.SUBJECT = "Subject4"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub5.setOnClickListener {
                    KEY.SUBJECT = "Subject5"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
            }

            if (KEY.SEM == "4") {

                sub1.text="Engineering Geology"
                sub2.text="Hydraulic Engineering"
                sub3.text="Environmental Engineering"
                sub4.text="Introduction to Solid Mechanics"
                sub5.text="Building Construction"

                sub1.setOnClickListener {
                    KEY.SUBJECT = "Subject1"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub2.setOnClickListener {
                    KEY.SUBJECT = "Subject2"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
                sub3.setOnClickListener {
                    KEY.SUBJECT = "Subject3"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub4.setOnClickListener {
                    KEY.SUBJECT = "Subject4"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }

                sub5.setOnClickListener {
                    KEY.SUBJECT = "Subject5"
                    Toast.makeText(activity, "Comming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.action_subjectsFragment_to_listFragment)
                }
            }
        }


    }
}