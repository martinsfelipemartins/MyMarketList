package com.example.core.domain.usecase.content

import com.example.core.data.repository.ContentRepository
import com.example.core.domain.model.NoteContentDTO

class DeleteContent(private val repository: ContentRepository) {

    suspend fun invoke(contentDTO: NoteContentDTO) = repository.removeContent(contentDTO)
}