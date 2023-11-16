package com.example.gymapp.ui.view.screen.main.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun accountScreenPreview() {
    accountScreen()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun accountScreen(
    navController: NavHostController?= null
) {

    var textEmail by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }




    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Button(onClick = { navController?.navigate("accountSettingsScreen") }) {
            Text(text = "Settings")
        }


    }
}