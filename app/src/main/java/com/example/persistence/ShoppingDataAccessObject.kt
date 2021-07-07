package com.example.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao

interface ShoppingDataAccessObject {
    @Insert
    fun addShoppingItem(shoppingItem: ShoppingModel)


    @Query("SELECT * from ShoppingModel")
    fun getAllShoppingItems(): LiveData<List<ShoppingModel>>

    @Delete
    fun delete(shoppingItem: ShoppingModel)
}