package com.example.wishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

//#5 База данных пожеланий в основном говорит
//о том, как должна выглядеть база данных
@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase: RoomDatabase() {
    abstract fun wishDao(): WishDao
}