package com.example.myapplication.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.models.Product
import com.example.myapplication.domain.repositories.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {

    fun addProduct(product: Product) {
        viewModelScope.launch {
            productRepository.addProduct(product)
        }
    }

    fun getProductById(id: Int, callback: (Product?) -> Unit) {
        viewModelScope.launch {
            val product = productRepository.getProductById(id)
            callback(product)
        }
    }

    fun updateProduct(product: Product) {
        viewModelScope.launch {
            productRepository.updateProduct(product)
        }
    }

    fun deleteProduct(id: Int) {
        viewModelScope.launch {
            productRepository.deleteProduct(id)
        }
    }
} 