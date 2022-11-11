package com.example.criminal_intent_sav

import java.util.*
import kotlin.properties.Delegates

data class Crime (val id: UUID = UUID.randomUUID()){
    var isSolved by Delegates.notNull<Boolean>()
    lateinit var date: Any
    lateinit var title: String
}