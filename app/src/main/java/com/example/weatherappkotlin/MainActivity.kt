package com.example.weatherappkotlin

import android.R
import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherappkotlin.ui.theme.WeatherAppKotlinTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    TopAppBar({ MainTopBar() })

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        WeatherScreen()

    }


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar() {
    TopAppBar(modifier = Modifier,

        title = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp), // Padding if needed
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,

                    ) {
                    Text(text = "SanDiego, USA", modifier = Modifier)

                }
            }
        }, navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Menu, contentDescription = "Menu")
            }
        }, actions = {
            IconButton(onClick = { /* TODO: Add action */ }) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier.padding(end = 15.dp)
                )
            }
        })
}

@Composable
fun WeatherScreen() {
    Column(
        modifier = Modifier.padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Today, 22.07",
            modifier = Modifier.padding(all = 10.dp),
            color = Color.Gray,

            )
        //Image(bitmap = , contentDescription = )

        Text(text = "25", modifier = Modifier.padding(all = 20.dp))
        Text(text = "Stormy", modifier = Modifier.padding(all = 20.dp))



        Row(modifier = Modifier) {


            Card(modifier = Modifier.size(width = 160.dp, height = 85.dp)) {
                Box(
                    modifier = Modifier.fillMaxSize(), // Box bileşenini Card'ın tamamını kaplayacak şekilde ayarlayın
                    contentAlignment = Alignment.Center // İçeriği ortalar
                ) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "+")
                        Spacer(modifier = Modifier.width(5.dp)) // Spacer'ı yatayda 5.dp boşluk bırakacak şekilde ayarlayın
                        Column(
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Wind")
                            Text(text = "12.4 km/h")
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.padding(4.dp))

            Card(modifier = Modifier.size(width = 160.dp, height = 85.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row (
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(text = "+")
                        Column {
                            Text(text = "Index UV")
                            Text(text = "0")

                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(4.dp))

        Row {
            Card(modifier = Modifier.size(width = 160.dp, height = 85.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row (
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(text = "+")
                        Column {
                            Text(text = "Temperature")
                            Text(text = "25")

                        }
                    }
                }

            }
            Spacer(modifier = Modifier.padding(4.dp))
            Card(modifier = Modifier.size(width = 160.dp, height = 85.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "+")
                        Column {
                            Text(text = "Humidity")
                            Text(text = "%75")

                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(200.dp))

        Row(modifier = Modifier, horizontalArrangement = Arrangement.SpaceBetween) {

        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier, horizontalArrangement = Arrangement.SpaceBetween) {


        }


    }
}


@Composable
fun MainTopBarPreview() {
    HomeScreen()
}