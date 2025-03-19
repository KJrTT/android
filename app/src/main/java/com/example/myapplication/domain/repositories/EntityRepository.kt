package com.example.myapplication.domain.repositories

interface EntityRepository {
    suspend fun deleteEntityById(entityId: Int)
    // Other repository methods...
} 