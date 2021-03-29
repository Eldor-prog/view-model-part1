package uz.eldor.lesson16_viewmodel

import androidx.lifecycle.ViewModel

class PersonViewModel(private val name: String) : ViewModel() {
    val data = ArrayList<PersonData>()
}