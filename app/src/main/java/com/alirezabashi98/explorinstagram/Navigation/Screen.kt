package com.alirezabashi98.explorinstagram.Navigation

sealed class Screen(val route : String){
    object Home : Screen(route = "home_screen")
}
