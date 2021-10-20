package com.scorpiona.composedemo

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.scorpiona.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonDemo()
            }
        }
    }
}

@Composable
fun ButtonDemo(){
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    }) {
        Text("Add To Cart")
    }

    Button(
        onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    },
    enabled = false
    ) {
        Text("Add To Cart")
    }

    TextButton(onClick = {
        Toast.makeText(context, "Clicked on TextButton", Toast.LENGTH_LONG).show()
    }) {
        Text("Add To Cart")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context, "Clicked on OutlinedButton", Toast.LENGTH_LONG).show()
    }) {
        Text("Add To Cart")
    }
    
    IconButton(onClick = {
        Toast.makeText(context, "Clicked on IconButton", Toast.LENGTH_LONG).show()
    }) {
        Icon(Icons.Filled.Refresh, contentDescription = "Refresh Button",
        tint = Color.Blue,
        modifier = Modifier.size(85.dp))
    }

    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    },
        contentPadding = PaddingValues(15.dp),
        border = BorderStroke(15.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text("Add To Cart",
        style = MaterialTheme.typography.h4,
        modifier = Modifier.padding(7.dp))
    }

    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    },
        shape = CutCornerShape(15.dp),
        contentPadding = PaddingValues(15.dp),
        border = BorderStroke(15.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text("Add To Cart",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(7.dp))
    }

    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    },
        shape = CircleShape,
        contentPadding = PaddingValues(15.dp),
        border = BorderStroke(15.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text("Add To Cart",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(7.dp))
    }
}
