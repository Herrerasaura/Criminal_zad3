package com.example.criminal_intent_sav

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0..100)
        {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = false
            if (i % 2 == 0)
            {
                crime.isSolved = true
            }
        }
    }
}