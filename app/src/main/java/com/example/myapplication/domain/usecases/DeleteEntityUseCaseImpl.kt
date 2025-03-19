package com.example.myapplication.domain.usecases

import com.example.myapplication.domain.repositories.EntityRepository

class DeleteEntityUseCaseImpl(private val repository: EntityRepository) : DeleteEntityUseCase {
    override suspend fun deleteEntity(entityId: Int) {
        repository.deleteEntityById(entityId)
    }
} 