package com.example.jetpackcompose




import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scafoldState  = rememberScaffoldState()
            
           Scaffold(modifier = Modifier.fillMaxSize(),
                    scaffoldState  =
               ) {

           }

            /*
            val painter = painterResource(id = R.drawable.duck)
            val description = "Duck "
            val title = "Yellow Duck"


            ImageCard(painter = painter, contentDescrition = description, title = title)
  */

            /*
            Row(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(0.5f)
                    .background(Color.Green),
                 horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(text = "Hello")
                Text(text = "World")
                Text(text="Hello")
            }


            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }

             */
            }
        }
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}


@Composable
fun ImageCard(
    painter: Painter,
    contentDescrition:String,
    title:String,
    modifier:Modifier = Modifier
){
     Card(

         modifier=modifier.fillMaxWidth(),
         shape = RoundedCornerShape(15.dp),
         elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)

     ){

         Box (modifier=Modifier.height(200.dp)){


             Image(painter,contentDescrition,Modifier, Alignment.Center, ContentScale.Crop)

             Box(modifier= Modifier
                 .fillMaxSize()
                 .background(
                     Brush.verticalGradient(
                         colors = listOf(
                             Color.Transparent,
                             Color.Black
                         ),

                         startY = 300f
                     )
                 ))

             Box(modifier = Modifier
                 .fillMaxSize()
                 .padding(12.dp)){

                 Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
                 
             }

         }

     }
}