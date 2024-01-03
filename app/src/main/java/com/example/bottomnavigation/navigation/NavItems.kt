package com.example.bottomnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems (
    val title:String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val route:String
)
val listOfNavItems = listOf<NavItems>(
    NavItems(
        title = "Home",
        unselectedIcon=Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        title = "Chat",
        unselectedIcon=Icons.Outlined.MailOutline,
        selectedIcon = Icons.Filled.Email,
        route = Screens.ChatScreen.name
    ),
    NavItems(
        title = "Favourite",
        unselectedIcon=Icons.Outlined.FavoriteBorder,
        selectedIcon = Icons.Filled.Favorite,
        route = Screens.FavouriteScreen.name
    ),
    NavItems(
        title = "Setting",
        unselectedIcon=Icons.Outlined.Settings,
        selectedIcon = Icons.Filled.Settings,
        route = Screens.SettingScreen.name
    )
)