package com.example.persistence

import androidx.lifecycle.ViewModel
import androidx.room.Database

class ShoppingViewModel: ViewModel {
    fun addShoppingItem(
        shoppingItem: ShoppingModel,
        database: ShoppinDatabase){
        database.shoppingDataAccessObject().addShoppingItem(shoppingItem)
    }
    fun getAllShoppingItems(database: Database
    )
}