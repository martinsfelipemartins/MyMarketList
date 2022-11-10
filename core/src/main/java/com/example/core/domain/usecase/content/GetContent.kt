package com.example.core.domain.usecase.content

import com.example.core.data.repository.ContentRepository

class GetContent(private val repository: ContentRepository) {
    suspend operator fun invoke(id: Long) = repository.getContent(id)}