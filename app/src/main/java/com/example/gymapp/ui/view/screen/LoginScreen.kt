package com.example.gymapp.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.navigation.NavHostController
import com.example.gymapp.ui.view.navigation.navigation

@Preview
@Composable
fun loginScreenPreview() {
    loginScreen(navigation())
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginScreen(navController: NavHostController) {

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
            Button(onClick = { /*TODO*/ }) {
                Text(text = "LogIn")
            }
            Button(onClick = { navController.navigate("signupScreen") }) {
                Text(text = "SignUp")
            }
        }
    }
}