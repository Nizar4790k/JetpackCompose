package com.example.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun Lists(){

    LazyColumn{

        itemsIndexed(listOf(
            "This","is","Jetpack","Compose"
        )){index,string->
            Text(
                text = string,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.
                fillMaxSize().
                padding(vertical = 24.dp)
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    JetpackComposeTheme {
        Lists()
    }
}