package com.udit.moviesapp

import android.R
import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Movie1(onMovie2 :() -> Unit, onMovie3 : () -> Unit)
{
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable),
            contentDescription = "Demo Image",
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
                .padding(bottom = 20.dp)
        )
        Text(text = "Movie 1", fontSize = 30.sp)

        Button(
            onClick = onMovie2,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Movie 2")
        }
        Button(
            onClick = onMovie3,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Movie 3")
        }
    }
}