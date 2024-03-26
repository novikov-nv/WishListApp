package com.example.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
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
