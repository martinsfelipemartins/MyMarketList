package com.example.mymarketlist.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymarketlist.databinding.FragmentNoteContentBinding
import com.example.mymarketlist.presentation.adapters.NoteContentAdapter
import com.example.mymarketlist.presentation.adapters.UserTypedListener
import com.example.mymarketlist.presentation.vo.NoteContentVO

class NoteContentFragment : Fragment(), UserTypedListener{

    companion object {
        fun newInstance() = NoteContentFragment()
        lateinit var userTypedListener: UserTypedListener
    }

    private var contentList = mutableListOf<NoteContentVO>()

    private val contentAdapter by lazy {
        NoteContentAdapter(this).apply {
            submitList(contentList)
        }
    }

    private lateinit var binding: FragmentNoteContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteContentBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        setupFloatingButton()
    }


    private fun setupAdapter() {
        with(binding.recyclerViewContent) {
            adapter = contentAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }



    private fun setupFloatingButton(){
        binding.floatingActionButton.setOnClickListener {
            contentList.add(NoteContentVO("", "", false))
            setupAdapter()
        }
    }

    private fun returnTezxt(tect: String):String{
         return tect
    }

    override fun editTextListener(typedText: String) {
        returnTezxt(typedText)
    }
}