package com.example.core.data.repository

import com.example.core.domain.model.NoteContentDTO

interface ContentDataSource {

    suspend fun add(noteContentDTO: NoteContentDTO)

    suspend fun remove(noteContentDTO: NoteContentDTO)

    suspend fun getAllContentNotes(): List<NoteContentDTO>

    suspend fun getContentNote(id: Long): NoteContentDTO
}