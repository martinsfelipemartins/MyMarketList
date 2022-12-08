package com.example.mymarketlist.presentation.vo

data class NoteContentVO(
    val contentId: String,
    val content: String?,
    val isChecked: Boolean = false
)
