package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.lab14.ui.theme.Lab14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab14Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFFE3F2FD)), // Cambia el color a tu preferencia
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Encabezado de la pantalla principal
                        Text(
                            text = "Pantalla Principal",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Color(0xFF1E88E5), // Azul para el texto
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Saludo de bienvenida
                        Text(
                            text = "bienvenido",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Gray,
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        // Botón para ver detalles
                        Button(
                            onClick = { /* Acción para ver detalles */ },
                            modifier = Modifier
                                .fillMaxWidth(0.7f)
                                .height(50.dp)
                                .padding(horizontal = 16.dp),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Ver Detalles")
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Botón para ajustes
                        OutlinedButton(
                            onClick = { /* Acción para abrir ajustes */ },
                            modifier = Modifier
                                .fillMaxWidth(0.7f)
                                .height(50.dp)
                                .padding(horizontal = 16.dp),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Ajustes")
                        }

                        Spacer(modifier = Modifier.height(32.dp))

                        // Indicador de estado o información adicional
                        Text(
                            text = "Estado: En línea",
                            color = Color.Green,
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}