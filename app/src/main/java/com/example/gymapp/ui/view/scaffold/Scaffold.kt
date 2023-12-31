package com.example.gymapp.ui.view.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffold(
    navController: NavHostController? = null, screen: @Composable (PaddingValues) -> Unit
) {

    val list = listOf(
        NavBarItem("Home", "homeScreen", Icons.Filled.Home),
        NavBarItem("Second", "homeScreen", Icons.Filled.Star),
        NavBarItem("Account", "accountScreen", Icons.Filled.AccountCircle)
    )

    var selectedItem by remember { mutableStateOf<Int>(0) }

    Scaffold(content = {
        screen(it)

    }, bottomBar = {
        NavigationBar {

            list.forEachIndexed { index, navBarItem ->
                NavigationBarItem(

                    label = { Text(navBarItem.screenName) },
                    icon = {
                        Icon(
                            navBarItem.icon, contentDescription = navBarItem.screenName
                        )
                    },
                    onClick = {
                        if (selectedItem != index)
                            navController?.navigate(navBarItem.route)

                        selectedItem = index

                    },
                    selected = selectedItem == index
                )
            }


        }

    })
}