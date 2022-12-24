package com.example.mymarketlist.presentation.adapters

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mymarketlist.databinding.ItemContentBinding
import com.example.mymarketlist.presentation.vo.NoteContentVO

class NoteContentAdapter(private val userTypedListener: UserTypedListener) :
    ListAdapter<NoteContentVO, NoteContentAdapter.NoteContentViewHolder>(DIFF_LIST) {

    class NoteContentViewHolder(private val itemBinding: ItemContentBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        companion object {

            fun create(parent: ViewGroup): NoteContentViewHolder {
                val itemBinding =
                    ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return NoteContentViewHolder(itemBinding)
            }
        }

        fun bind(noteContentVO: NoteContentVO, userTypedListener: UserTypedListener) {
            itemBinding.contentText.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun afterTextChanged(p0: Editable?) {
                    userTypedListener.editTextListener(p0.toString())
                }
            })

            itemBinding.checkboxContent.isChecked = noteContentVO.isChecked
            userTypedListener.editTextListener(itemBinding.contentText.text.toString())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteContentViewHolder {
        return NoteContentViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: NoteContentViewHolder, position: Int) {
        holder.bind(getItem(position), userTypedListener)
    }

    companion object {
        private val DIFF_LIST = object : DiffUtil.ItemCallback<NoteContentVO>() {
            override fun areItemsTheSame(oldItem: NoteContentVO, newItem: NoteContentVO): Boolean {
                return oldItem.contentId == newItem.contentId
            }

            override fun areContentsTheSame(
                oldItem: NoteContentVO,
                newItem: NoteContentVO
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}