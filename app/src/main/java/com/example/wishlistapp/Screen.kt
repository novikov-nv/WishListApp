package com.example.wishlistapp

//sealed - чтобы никто не мог наследовать от него
sealed class Screen (val root: String){
    object HomeScreen: Screen("home_screen")
    object AddScreen: Screen("add_screen")
}