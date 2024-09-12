package com.silvie.harrypotter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HouseScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Harry Potter")

        Row(modifier = Modifier.weight(1f)) {
            ImageSection(modifier = Modifier.weight(1f), imageRes = R.drawable.gryffindor)
            ImageSection(modifier = Modifier.weight(1f), imageRes = R.drawable.hufflepuff)
        }
        Row(modifier = Modifier.weight(1f)) {
            ImageSection(modifier = Modifier.weight(1f), imageRes = R.drawable.ravenclaw)
            ImageSection(modifier = Modifier.weight(1f), imageRes = R.drawable.slytherin)
        }
    }

}

@Composable
fun ImageSection(modifier: Modifier, imageRes: Int) {
    Box(modifier = modifier.padding(4.dp)) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }

}