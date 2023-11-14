package com.example.gymapp.ui.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.ui.view.screen.first.login.loginScreen
import com.example.gymapp.ui.view.screen.first.signUp.signUpScreen
import com.example.gymapp.ui.view.screen.first.signUp.signUpSecondScreen


@Composable
fun navigation(): NavHostController {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "loginScreen") {
        composable("loginScreen") { loginScreen(navController) }
        composable("signupScreen") { signUpScreen(navController) }
        composable("signupSecondScreen") { signUpSecondScreen(navController) }
        composable("main") { navigationMain(navController) }
    }

    return navController
}