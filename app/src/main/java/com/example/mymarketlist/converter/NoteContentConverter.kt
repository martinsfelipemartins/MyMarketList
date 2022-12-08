package com.example.mymarketlist.converter

import com.example.core.domain.model.NoteContentDTO
import com.example.mymarketlist.presentation.vo.NoteContentVO

class NoteContentConverter {

    fun mapper (contentDTO: NoteContentDTO) =
        NoteContentVO(
            contentId = contentDTO.id,
            content = contentDTO.content,
            isChecked = contentDTO.isChecked
        )
}