package com.example.gate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.gate.databinding.ActivityNotesKeepBinding

class NotesKeepActivity : AppCompatActivity(), OnTapHandler {

    lateinit var binding: ActivityNotesKeepBinding
    private val viewModel: NotesViewModel by viewModels {
        NotesViewModelFactory((application as NoteApplication).repository)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesKeepBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = RecyclerViewAdapter(this)
        binding.myRecyclerView.adapter = adapter

        viewModel.allNotes.observe(this, { notes ->
            notes?.let {
                adapter.updateNotes(notes)
            }
        })
    }

    fun addNewNote(view: android.view.View) {
        val noteText = binding.addNoteView.text.toString()
        if (noteText.isNotEmpty()) {
            viewModel.insert(NoteEntity(note = noteText))
        }
    }
    override fun onItemClick(note: NoteEntity) {
        viewModel.delete(note)
    }
}