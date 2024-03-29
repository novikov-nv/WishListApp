package com.example.wishlistapp

import android.content.Context
import androidx.room.Room
import com.example.wishlistapp.data.WishDatabase
import com.example.wishlistapp.data.WishRepository

//В Kotlin ключевое слово object используется для объявления singleton

//Итак, этот объект graph здесь эффективно
// действует как простой контейнер
// зависимостей, где он инициализирует
//и предоставляет экземпляры базы данных и
//репозитория, необходимые приложению.
object Graph {
    lateinit var database: WishDatabase

    //by lazy -> просто убедитесь,
    //что эта переменная инициализируется
    //только один раз после первого доступа
    //к репозиторию wish.
    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }
    //ключевое слово late init полезно,
    //когда экземпляр необходимо инициализировать
    //с помощью внедрения зависимостей,


    fun provide(context: Context) {
        database = Room.databaseBuilder(
            context = context,
            klass = WishDatabase::class.java,
            name = "wishlist.db"
        ).build()
    }
}