package com.example.bottomnavigation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigation.screen.ChatScreen
import com.example.bottomnavigation.screen.FavouriteScreen
import com.example.bottomnavigation.screen.HomeScreen
import com.example.bottomnavigation.screen.SettingScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItems ->
                    NavigationBarItem(selected = currentDestination?.hierarchy?.any { it.route == navItems.route } == true,
                        onClick = {
                            navController.navigate(navItems.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(imageVector = navItems.icon, contentDescription = "")
                        },
                        label = { Text(text = navItems.title) })
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name) {
                HomeScreen()
            }

            composable(route = Screens.ChatScreen.name) {
                ChatScreen()
            }

            composable(route = Screens.FavouriteScreen.name) {
                FavouriteScreen()
            }

            composable(route = Screens.SettingScreen.name) {
                SettingScreen()
            }
        }
    }
}