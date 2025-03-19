package com.example.myapplication.domain.usecases

interface DeleteEntityUseCase {
    suspend fun deleteEntity(entityId: Int)
} 