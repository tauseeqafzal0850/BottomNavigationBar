package com.example.bottomnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems (
    val title:String,
    val icon: ImageVector,
    val route:String
)
val listOfNavItems = listOf<NavItems>(
    NavItems(
        title = "Home",
        icon = Icons.Filled.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        title = "Chat",
        icon = Icons.Filled.Email,
        route = Screens.ChatScreen.name
    ),
    NavItems(
        title = "Favourite",
        icon = Icons.Filled.Favorite,
        route = Screens.FavouriteScreen.name
    ),
    NavItems(
        title = "Setting",
        icon = Icons.Filled.Settings,
        route = Screens.SettingScreen.name
    )
)