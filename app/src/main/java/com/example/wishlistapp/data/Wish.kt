package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "aaaa", description = "aaaaaaaa"),
        Wish(title = "bbbb", description = "bbbbbbbb"),
        Wish(title = "cccc", description = "cccccccc"),
        Wish(title = "dddd", description = "dddddddd"),
        Wish(title = "eeee", description = "eeeeeeee"),
    )
}
