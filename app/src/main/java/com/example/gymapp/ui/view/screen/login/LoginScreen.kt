package com.example.gymapp.ui.view.screen.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Preview
@Composable
fun loginScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
    loginScreen(null)}
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginScreen(navController: NavHostController?) {

    var textEmail by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }




    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {


        TextField(
            value = textEmail,
            label = { Text(text = "Email") },
            onValueChange = { textEmail = it })
        TextField(
            value = textPassword,
            label = { Text(text = "Password") },
            onValueChange = { textPassword = it })


        Column(
            modifier = Modifier.fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        )
        {
            Button(onClick = { navController?.navigate("mainScreen") }) {
                Text(text = "LogIn")
            }
            Button(onClick = { navController?.navigate("signupScreen") }) {
                Text(text = "SignUp")
            }
        }
    }
}