package com.example.core.domain.usecase.content

import com.example.core.data.repository.ContentRepository
import com.example.core.domain.model.NoteContentDTO

class AddContent(private val repository: ContentRepository) {

    suspend fun invoke(contentDTO: NoteContentDTO) = repository.addContent(contentDTO)
}