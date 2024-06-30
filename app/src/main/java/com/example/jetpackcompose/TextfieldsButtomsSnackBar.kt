package com.example.jetpackcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TextfieldsButtomsSnackBar(){

    var textValue  by remember {
        mutableStateOf("")
    }

    var snackBarHostState  =  remember {
        SnackbarHostState()
    }

    val scope = rememberCoroutineScope()

    Scaffold (modifier = Modifier.fillMaxSize(), snackbarHost ={ SnackbarHost(hostState = snackBarHostState)}){


        Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)){

            Row{
                TextField(
                    value = textValue,
                    onValueChange = { textValue= it},
                    label = {"Enter your name"})
            }

            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(onClick = {
                scope.launch{
                    snackBarHostState.showSnackbar(message = "Hello ${textValue}")

                }


            }) {
                Text(text = "Click me")
                
            }

        }


    }
}