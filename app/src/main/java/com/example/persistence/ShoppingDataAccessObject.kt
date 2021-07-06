package com.example.persistence

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao

interface ShoppingDataAccessObject {
    @Insert
        fun addShoppingItem(shoppingItem: ShoppingModel)


        @Query ("SELECT * from shoppingmodel")
        fun getAllShoppingItems(): List<ShoppingModel>

    @Delete
    fun delete(shoppingItem:ShoppingModel)
}