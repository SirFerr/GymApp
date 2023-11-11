package com.example.gymapp.ui.view.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.ui.view.scaffold.scaffold
import com.example.gymapp.ui.view.screen.main.homeScreen


@Composable
fun navigationWithScaffold(navControllerFirst: NavHostController): NavHostController {
    val navController = rememberNavController()
    scaffold(navController = navController, screen = { innerPadding ->
        NavHost(
            navController = navController, startDestination = "homeScreen",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("homeScreen") {
                homeScreen(
                    navController = navController,
                )
            }
        }
    })


    return navController
}