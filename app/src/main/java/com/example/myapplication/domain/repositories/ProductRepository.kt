package com.example.myapplication.domain.repositories

interface ProductRepository {
    suspend fun addProduct(product: Product)
    suspend fun getProductById(id: Int): Product?
    suspend fun updateProduct(product: Product)
    suspend fun deleteProduct(id: Int)
} 