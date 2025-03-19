package com.example.myapplication.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.usecases.DeleteEntityUseCase
import kotlinx.coroutines.launch

class EntityViewModel(private val deleteEntityUseCase: DeleteEntityUseCase) : ViewModel() {

    fun deleteEntity(entityId: Int) {
        viewModelScope.launch {
            deleteEntityUseCase.deleteEntity(entityId)
        }
    }
} 