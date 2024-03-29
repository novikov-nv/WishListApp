package com.example.wishlistapp

import android.app.Application

class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(context = this) //- это контекст,
    // в котором вы должны создавать всю базу данных
    }
}