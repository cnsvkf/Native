package com.example.nativeui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.nativeui.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Route(val route: String) {
    object Intro : Route(route = "intro")
    object WelCome : Route(route = "welcome")
}

@Composable
fun BookOnNav() {
    val nevController = rememberNavController()

    NavHost(
    navController = nevController,
    startDestination = Route.Intro.route
    ) {
        composable(route = Route.Intro.route) {
           BookOn(
                onClick = { nevController.navigate("welcome") }
            )
        }
        composable(route = "welcome") {
            BookOn_Welcome(onClick ={})
        }
    }
}
