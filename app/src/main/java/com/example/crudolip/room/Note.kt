package com.example.crudolip.room

import android.icu.text.CaseMap.Title
import android.security.identity.AccessControlProfileId
import androidx.appcompat.widget.DialogTitle
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)
