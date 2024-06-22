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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val fontFamily = FontFamily(
                Font(R.font.lexend_thin,FontWeight.Thin),
                Font(R.font.lexend_light,FontWeight.Light),
                Font(R.font.lexend_regular,FontWeight.Normal),
                Font(R.font.lexend_medium,FontWeight.Medium),
                Font(R.font.lexend_semibold,FontWeight.SemiBold),
                Font(R.font.lexend_bold,FontWeight.Bold),
                Font(R.font.lexend_extrabold,FontWeight.Light),

            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(color = 0xFFF101010))
            ) {
                Text(
                    text = buildAnnotatedString
                    { withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)
                    ) {
                        append("J")
                    }
                        append("epack ")

                        withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)
                        ) {
                            append("C")
                        }

                        append("ompose")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
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