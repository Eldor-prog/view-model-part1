package uz.eldor.lesson16_viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class PersonViewModelFactory(private val name: String) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersonViewModel::class.java)){
            return PersonViewModel(name) as T
        }
        throw IllegalArgumentException("It is not PersonViewModel class")
    }
}