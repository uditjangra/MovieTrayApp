package com.udit.moviesapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentComposer
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavHostRoute(navHostController: NavHostController){
    NavHost(navHostController, "Opening") {
        composable("movie1"){
            Movie1(onMovie2 = {
                navHostController.navigate("movie2")
            },
                onMovie3 = {
                    navHostController.navigate("movie3")
                }
            )
        }
        composable("movie2"){
            Movie2(onMovie1 = {
                navHostController.navigate("movie1")
            },
                onMovie3 = {
                    navHostController.navigate("movie3")
                }
            )
        }
        composable("movie3"){
            Movie3(onMovie1 = {
                navHostController.navigate("movie1")
            },
                onMovie2 = {
                    navHostController.navigate("movie3")
                }
            )
        }
        composable("Opening"){
            OpeningPage(onMovie1 = {
                navHostController.navigate("movie1")
            },
                onMovie2 = {
                    navHostController.navigate("movie2")
                },
                onMovie3 = {
                    navHostController.navigate("movie3")
                }
            )
        }

    }
}