package com.example.gymapp.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.gymapp.ui.view.navigation.navigation

@Preview
@Composable
fun signUpScreenSecondPreview(){
    signUpSecondScreen(navigation())
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun signUpSecondScreen(navController: NavHostController) {


    val state = remember { mutableStateOf(true) }
    val change= { state.value = !state.value }


    var textWeight by remember { mutableStateOf("") }
    var textHeight by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {


        TextField(
            value = textWeight,
            label = { Text(text = "Weight") },
            onValueChange = { textWeight = it })
        TextField(
            value = textHeight,
            label = { Text(text = "Height") },
            onValueChange = { textHeight = it })


        Column(Modifier.selectableGroup()){
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                RadioButton(
                    selected = state.value,
                    onClick = { state.value = true }
                )
                Text("Male", fontSize = 22.sp)
            }
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                RadioButton(
                    selected = !state.value,
                    onClick = { state.value = false }
                )
                Text("Female",  fontSize = 22.sp)
            }
        }
            Button(onClick = { navController?.navigate("loginScreen") }) {
                Text(text = "SignUp")
            }

    }
}