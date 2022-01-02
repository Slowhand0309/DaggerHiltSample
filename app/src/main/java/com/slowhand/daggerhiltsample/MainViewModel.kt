package com.slowhand.daggerhiltsample

import androidx.lifecycle.ViewModel
import com.slowhand.daggerhiltsample.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: UserRepository) : ViewModel() {
    fun fetch() = repository.fetch()
}