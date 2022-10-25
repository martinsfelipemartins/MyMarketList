package com.example.core.data.repository

import com.example.core.domain.model.NoteContentDTO

class ContentRepository(private val contentDataSource: ContentDataSource) {

    suspend fun addContent(noteContentDTO: NoteContentDTO) = contentDataSource.add(noteContentDTO)

    suspend fun removeContent(noteContentDTO: NoteContentDTO) =
        contentDataSource.remove(noteContentDTO)

    suspend fun getContent(id: Long) = contentDataSource.getContentNote(id)

    suspend fun getAllContents() = contentDataSource.getAllContentNotes()

}
