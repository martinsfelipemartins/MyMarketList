package com.example.mymarketlist.presentation.vo

data class NoteContentVO(
    val contentId: Long = 0,
    val content: String?,
    val isChecked: Boolean = false
)
