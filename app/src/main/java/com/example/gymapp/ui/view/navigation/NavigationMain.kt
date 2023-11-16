package com.example.gymapp.ui.view.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.ui.view.scaffold.scaffold
import com.example.gymapp.ui.view.screen.main.account.accountScreen
import com.example.gymapp.ui.view.screen.main.account.accountSettings.accountSettingScreen
import com.example.gymapp.ui.view.screen.main.home.homeScreen


@Composable
fun navigationMain(firstNavController: NavHostController): NavHostController {
    val navController = rememberNavController()
    scaffold(navController = navController, screen = {
        NavHost(
            navController = navController, startDestination = "homeScreen",
            modifier = Modifier.padding(it)
        ) {
            composable("homeScreen") {
                homeScreen(
                    navController = navController,
                )
            }
            composable("accountScreen") {
                accountScreen(
                    navController = navController,
                )
            }
            composable("accountSettingsScreen") {
                accountSettingScreen(
                    navController,
                    firstNavController
                )
            }
        }
    })


    return navController
}