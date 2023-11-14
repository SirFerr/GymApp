package com.example.gymapp.ui.view.screen.main.accountSettings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Preview
@Composable
fun accountSettingScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
    ) {
        accountSettingScreen(null, null)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun accountSettingScreen(
    mainNavController: NavHostController?,
    firstNavController: NavHostController?
) {

    var textEmail by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {


        Button(onClick = {
            firstNavController?.navigate("loginScreen") {
                popUpTo("main") { inclusive = true }

            }
        }) {
            Text(text = "LogOut")
        }

    }
}