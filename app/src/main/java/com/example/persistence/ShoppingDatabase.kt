package com.example.persistence

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = arrayOf(ShoppingModel::class),
version = 1
    )

abstract class ShoppingDatabase: RoomDatabase() {

    abstract fun shoppingDataAccessObject(): shoppingDataAccessObject

}