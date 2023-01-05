package com.example.mymarketlist.presentation.view

import androidx.lifecycle.ViewModel
import com.example.core.data.repository.ContentDataSource
import com.example.mymarketlist.converter.NoteContentConverter
import com.example.mymarketlist.presentation.vo.NoteContentVO

class NoteContentViewModel(
    private val contentDataSource: ContentDataSource,
    private val converter: NoteContentConverter
) : ViewModel() {

    suspend fun addNewContent(contentVO: NoteContentVO) {
        converter.mapper(contentVO)?.let {
            contentDataSource.add(
                it
            )
        }
    }
}