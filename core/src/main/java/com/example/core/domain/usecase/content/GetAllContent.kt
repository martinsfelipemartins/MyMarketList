package com.example.core.domain.usecase.content

import com.example.core.data.repository.ContentRepository

class GetAllContent(private val repository: ContentRepository) {
    suspend operator fun invoke() = repository.getAllContents()
}