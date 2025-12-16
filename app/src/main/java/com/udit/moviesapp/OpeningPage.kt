package com.udit.moviesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun OpeningPage(onMovie1 :() -> Unit, onMovie2 : () -> Unit, onMovie3 :() -> Unit)
{
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Select One", fontSize = 30.sp)
        Button(
            onClick = onMovie1,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Kal Ho Na Ho")
        }
        Button(
            onClick = onMovie2,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Shiddat")
        }
        Button(
            onClick = onMovie3,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Jumanji")
        }
    }
}