package com.example.myapplication.data.repositories

import com.example.myapplication.data.databases.roomdatabase.roomdao.ProductDao
import com.example.myapplication.data.databases.roomdatabase.models.ProductEntity
import com.example.myapplication.domain.models.Product
import com.example.myapplication.domain.repositories.ProductRepository

class ProductRepositoryImpl(private val productDao: ProductDao) : ProductRepository {

    override suspend fun addProduct(product: Product) {
        productDao.insertProduct(ProductEntity(name = product.name, price = product.price))
    }

    override suspend fun getProductById(id: Int): Product? {
        return productDao.getProductById(id)?.let {
            Product(id = it.id, name = it.name, price = it.price)
        }
    }

    override suspend fun updateProduct(product: Product) {
        productDao.updateProduct(ProductEntity(id = product.id, name = product.name, price = product.price))
    }

    override suspend fun deleteProduct(id: Int) {
        productDao.getProductById(id)?.let {
            productDao.deleteProduct(it)
        }
    }
} 