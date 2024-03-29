package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow

//нужно настроить репозиторий wish,
//который позволит нам совместно с wish Dao
//позаботиться об этих функциях
class WishRepository(
    private val wishDao: WishDao
) {
    suspend fun addWish(wish: Wish) {
        wishDao.addAWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> {
        return wishDao.getAllWishes()
    }

    fun getAWishById(id: Long): Flow<Wish> {
        return wishDao.getWishById(id)
    }

    suspend fun updateWish(wish:Wish){
        wishDao.updateAWish(wish)
    }

    suspend fun deleteWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}