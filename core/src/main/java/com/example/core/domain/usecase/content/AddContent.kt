package com.example.core.domain.usecase.content

import com.example.core.data.repository.ContentRepository

class AddContent(repository: ContentRepository) {

    suspend fun invoke() = repository

}