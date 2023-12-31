package com.example.gymapp.ui.view.navigation

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.ui.view.screen.first.login.loginScreen
import com.example.gymapp.ui.view.screen.first.signUp.signUpScreen
import com.example.gymapp.ui.view.screen.first.signUp.signUpSecondScreen

@Preview(showSystemUi = true, showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)

@Composable
fun navigationPreview(){
    navigation()
}

@Composable
fun navigation(): NavHostController {

    val focusManager = LocalFocusManager.current

    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "loginScreen",
        modifier = Modifier.clickable(

            indication = null,
            interactionSource = remember { MutableInteractionSource() }
        ) { focusManager.clearFocus() }) {
        composable("loginScreen") { loginScreen(navController) }
        composable("signupScreen") { signUpScreen(navController) }
        composable("signupSecondScreen") { signUpSecondScreen(navController) }
        composable("main") { navigationMain(navController) }
    }

    return navController
}