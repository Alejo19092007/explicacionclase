package me.edwarjimenez.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.edwarjimenez.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen() {
    Column(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(18.dp)
            .fillMaxSize()
        ,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .padding(18.dp)
                .fillMaxWidth() // Este siempre va para aplicar espacios
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Inicio",
                //fontSize = 16.sp ,
                modifier = Modifier.background(Color.Red).padding(8.dp)
            )
            Text(
                text = "Perfil",
                //fontSize = 25.sp ,
                modifier = Modifier.background(Color.Green).padding(8.dp)
            )
            Text(
                text = "Configuracion",
                //fontSize = 25.sp ,
                modifier = Modifier.background(Color.Yellow).padding(8.dp)
            )
        }

        Text(
            text = "Titulo Principal",
            //fontSize = 25.sp ,
            modifier = Modifier.background(Color.Yellow).padding(8.dp)
        )
        Text(
            text = "Descripcion",
            //fontSize = 25.sp ,
            modifier = Modifier.background(Color.Yellow).padding(8.dp)
        )
        Text(
            text = "Otro elemento",
            //fontSize = 25.sp ,
            modifier = Modifier.background(Color.Yellow).padding(8.dp)
        )
    }


}
@Preview(showSystemUi = true)
@Composable
fun ContentTarea() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.circulo),
            contentDescription = "Check completado"
        )

        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}
@Preview(showSystemUi = true)
@Composable
fun QuadrantScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            QuadrantItem(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            QuadrantItem(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantItem(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description
        )
    }
}
@Preview(showSystemUi = true, name = "PantallaPerfil")
@Composable
fun ProfileScreen() {
    val purple = Color(0xFF6650A4)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ciclacirculo),
            contentDescription = "Foto de perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, purple, CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Alejandro Jimenez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        // Bio
        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem(value = "150", label = "Posts")
            StatItem(value = "2.3K", label = "Seguidores")
            StatItem(value = "980", label = "Likes")
        }

        Spacer(modifier = Modifier.height(12.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = purple),
                modifier = Modifier.weight(1f)
            ) {
                Text("Seguir")
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Mensaje", color = purple)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))


        val interests = listOf("Ciclismo", "Programación", "UI/UX", "Música", "Viajes", "Gaming")
        Column {
            interests.chunked(3).forEach { rowItems ->
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    rowItems.forEach { interest ->
                        Box(
                            modifier = Modifier
                                .border(1.dp, Color.Gray, RoundedCornerShape(50))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = interest,
                                fontSize = 14.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))


        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular),
                    contentDescription = "Proyecto",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp))
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "App de Ciclismo",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = purple),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text("Ver más", fontSize = 12.sp)
                    }
                }
            }
        }
    }
}


// estadísticas


@Composable
fun StatItem(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}