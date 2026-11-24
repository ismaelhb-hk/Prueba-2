package com.ismael.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ismael.prueba2.ui.theme.Prueba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun PruebaBox() {
    Box(modifier = Modifier.fillMaxSize().padding(all = 100.dp)){
        Text("Fila 1 Arriba Izqr"
        , modifier = Modifier.align(Alignment.TopStart ))
        Text("Fila 2 Medio"
        , modifier = Modifier.align(Alignment.Center ))
        Text("Fila3 Abajo Derecha"
        , modifier = Modifier.align(Alignment.BottomEnd ))
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    PruebaBox()


}