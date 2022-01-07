package com.example.gate

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gate.Model.ListModel

class ListFragment : Fragment() {

    lateinit var brow: Button
    lateinit var adapter: com.example.gate.Adapter.ListAdapter
    var list: ArrayList<ListModel> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        addData()
        var view = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.list_Recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = com.example.gate.Adapter.ListAdapter(list)
        recyclerView.adapter = adapter


        return view
    }


    private fun addData() {
        if (KEY.BRANCH == "CSE") {
            if (KEY.SEM == "3") {
                if (KEY.SUBJECT == "Subject1") {
                    list.add(ListModel("PDE", "https://drive.google.com/drive/folders/1b2oMHrOSEd8GFyG-6-K3NOg6Tr0AF0HB?usp=sharing"))
                    list.add(ListModel("Fourier Series", "http://www.wikipidea.com"))
                    list.add(ListModel("Laplace Transform", "http://www.wikipidea.com"))
                    list.add(ListModel("Probability Distribution", "http://www.wikipidea.com"))
                    list.add(ListModel("Complex Analysis", "http://www.wikipidea.com"))
                }
                if (KEY.SUBJECT == "Subject2") {
                    list.add(ListModel("Array & List", "http://www.wikipidea.com"))
                    list.add(ListModel("Stacks & Queues", "http://www.wikipidea.com"))
                    list.add(ListModel("Trees", "https://drive.google.com/drive/folders/1EMHQUhlEldVi7mljZlNK7S2ad4eMJ5zw?usp=sharing"))
                    list.add(ListModel("Graphs", "https://drive.google.com/drive/folders/1EMHQUhlEldVi7mljZlNK7S2ad4eMJ5zw?usp=sharing"))
                    list.add(ListModel("Sorting & Seaching", "https://drive.google.com/drive/folders/1EMHQUhlEldVi7mljZlNK7S2ad4eMJ5zw?usp=sharing"))
                }
            }
            if (KEY.SEM == "4") {
                if (KEY.SUBJECT == "Subject1") {
                    list.add(ListModel("B S C", "link"))
                    list.add(ListModel("Arithmetic", "http://www.wikipidea.com"))
                    list.add(ListModel("Memory System", "http://www.wikipidea.com"))
                    list.add(ListModel("I/O Organisation", "http://www.wikipidea.com"))
                    list.add(ListModel("P V P", "http://www.wikipidea.com"))
                }
                if (KEY.SUBJECT == "Subject2") {
                    list.add(ListModel("M L B A", "link"))
                    list.add(ListModel("Combinatorics", "http://www.wikipidea.com"))
                    list.add(ListModel("Relation & Func", "http://www.wikipidea.com"))
                    list.add(ListModel("Graph Theory", "http://www.wikipidea.com"))
                    list.add(ListModel("A S", "http://www.wikipidea.com"))
                }
            }
        }

        if (KEY.BRANCH == "CE") {
            if (KEY.SEM == "3") {
                if (KEY.SUBJECT == "Subject1") {
                    list.add(ListModel("PDE", "https://drive.google.com/drive/folders/1b2oMHrOSEd8GFyG-6-K3NOg6Tr0AF0HB?usp=sharing"))
                    list.add(ListModel("Fourier Series", "http://www.wikipidea.com"))
                    list.add(ListModel("Laplace Transform", "http://www.wikipidea.com"))
                    list.add(ListModel("Probability Distribution", "http://www.wikipidea.com"))
                    list.add(ListModel("Complex Analysis", "http://www.wikipidea.com"))
                }
                if (KEY.SUBJECT == "Subject2") {
                    list.add(ListModel("F E M", "link"))
                    list.add(ListModel("S F B M D D B", "http://www.wikipidea.com"))
                    list.add(ListModel("P J F F", "http://www.wikipidea.com"))
                    list.add(ListModel("G P P", "http://www.wikipidea.com"))
                    list.add(ListModel("V W E M", "http://www.wikipidea.com"))
                }
            }
            if (KEY.SEM == "4") {
                if (KEY.SUBJECT == "Subject1") {
                    list.add(ListModel("Gen Geology", "link"))
                    list.add(ListModel("Mineralogy", "http://www.wikipidea.com"))
                    list.add(ListModel("Petrology", "http://www.wikipidea.com"))
                    list.add(ListModel("Str. Geology", "http://www.wikipidea.com"))
                    list.add(ListModel("Engg Geology", "http://www.wikipidea.com"))
                }
                if (KEY.SUBJECT == "Subject2") {
                    list.add(ListModel("Turb. flow in Pipe", "link"))
                    list.add(ListModel("B L A", "http://www.wikipidea.com"))
                    list.add(ListModel("N U F O C", "http://www.wikipidea.com"))
                    list.add(ListModel("C E P L D A H S", "http://www.wikipidea.com"))
                    list.add(ListModel("Hyd. Mechanics", "http://www.wikipidea.com"))
                }
            }
        }
    }
}
