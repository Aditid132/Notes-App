package com.example.gate.Adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.gate.Model.ListModel
import com.example.gate.R

class ListAdapter(private val dataSet: List<ListModel>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_1, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.chapterName.text = dataSet[position].chapterName
        var url = dataSet[position].link.toString()
        holder.chapterBtn.setOnClickListener {


                var intent = Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url))
               it.context.startActivity(intent)
            }

//

    }


    override fun getItemCount(): Int {
        return dataSet.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName: TextView
        val chapterBtn: Button

        init {
            // Define click listener for the ViewHolder's View.
            chapterName = view.findViewById(R.id.chapterTitle)
            chapterBtn = view.findViewById(R.id.gobtn)
        }
    }
}