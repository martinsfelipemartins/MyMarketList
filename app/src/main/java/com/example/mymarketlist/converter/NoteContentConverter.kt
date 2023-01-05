package com.example.mymarketlist.converter

import com.example.core.domain.model.NoteContentDTO
import com.example.mymarketlist.presentation.vo.NoteContentVO

class NoteContentConverter {

    fun mapper(contentVO: NoteContentVO) =
        contentVO.content?.let {
            NoteContentDTO(
                id = contentVO.contentId,
                content = it,
                isChecked = contentVO.isChecked
            )
        }
}