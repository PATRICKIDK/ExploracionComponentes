package com.example.lab04.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.ExperimentalLayoutApi

// Ejemplo 1: LazyColumn
@Composable
fun LazyColumnExample() {
    LazyColumn(modifier = Modifier.height(120.dp)) {
        items(5) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// Ejemplo 2: LazyRow
@Composable
fun LazyRowExample() {
    LazyRow(modifier = Modifier.height(60.dp)) {
        items(5) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// Ejemplo 3: Grid (simulado con Row/Column)
@Composable
fun GridExample() {
    Column {
        repeat(3) { row ->
            Row {
                repeat(3) { col ->
                    Text("($row,$col)", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

// Ejemplo 4: ConstraintLayout
@Composable
fun ConstraintLayoutExample() {
    ConstraintLayout(modifier = Modifier.fillMaxWidth().height(100.dp)) {
        val (text1, text2) = createRefs()

        Text("Inicio", modifier = Modifier.constrainAs(text1) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
        })
        Text("Fin", modifier = Modifier.constrainAs(text2) {
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
    }
}

// Ejemplo 5: Scaffold
@Composable
fun ScaffoldExample() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text("+")
            }
        }
    ) { padding ->
        Text("Contenido Scaffold", modifier = Modifier.padding(padding))
    }
}

// Ejemplo 6: Surface
@Composable
fun SurfaceExample() {
    Surface(color = Color.LightGray, modifier = Modifier.padding(8.dp)) {
        Text("Soy un Surface", modifier = Modifier.padding(16.dp))
    }
}

// Ejemplo 7: Chip (simulado)
@Composable
fun ChipExample() {
    Surface(
        color = Color.Gray,
        shape = MaterialTheme.shapes.small,
        modifier = Modifier.padding(4.dp)
    ) {
        Text("Chip", modifier = Modifier.padding(8.dp))
    }
}

// Ejemplo 8: BackdropScaffold (simulado, ya no está en Material3)
@Composable
fun BackdropScaffoldExample() {
    Text("BackdropScaffold está deprecado en Material3. Ejemplo no disponible.")
}

// Ejemplo 9: FlowRow
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowExample() {
    FlowRow {
        repeat(10) { index ->
            Text("Item $index", modifier = Modifier.padding(4.dp))
        }
    }
}

// Ejemplo 10: FlowColumn
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowColumnExample() {
    FlowColumn {
        repeat(5) { index ->
            Text("Element $index", modifier = Modifier.padding(4.dp))
        }
    }
}
