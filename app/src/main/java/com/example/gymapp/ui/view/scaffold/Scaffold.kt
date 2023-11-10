package com.example.gymapp.ui.view.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffold(
    navController: NavHostController? = null,
    screen: @Composable (PaddingValues) -> Unit
) {


    Scaffold(
        content = { innerPadding ->

            screen(innerPadding)

        },
        bottomBar = {
            BottomAppBar {

                IconButton(onClick = {

                })
                {
                    Icon(
                        Icons.Filled.Home, contentDescription =
                        "Home"
                    )
                }
                IconButton(onClick = {


                })
                {
                    Icon(
                        Icons.Filled.Star, contentDescription =
                        "Second"
                    )
                }


            }
        }
    )
}