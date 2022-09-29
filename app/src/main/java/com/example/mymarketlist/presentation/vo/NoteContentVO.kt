package com.example.mymarketlist.presentation.vo

data class NoteContentVO(
    val contentId: Long,
    val content: String?,
    val isChecked: Boolean = false
)
