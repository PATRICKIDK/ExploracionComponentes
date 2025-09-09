package com.example.lab04.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color




// Ejemplo 11: AlertDialog
@Composable
fun AlertDialogExample() {
    var open by remember { mutableStateOf(true) }
    if (open) {
        AlertDialog(
            onDismissRequest = { open = false },
            confirmButton = {
                Button(onClick = { open = false }) { Text("OK") }
            },
            title = { Text("Alerta") },
            text = { Text("Este es un AlertDialog") }
        )
    }
}

// Ejemplo 12: Card
@Composable
fun CardExample() {
    Card(modifier = Modifier.padding(8.dp)) {
        Text("Soy una Card", modifier = Modifier.padding(16.dp))
    }
}

// Ejemplo 13: Checkbox
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }
    Row {
        Checkbox(checked = checked, onCheckedChange = { checked = it })
        Text("Opción seleccionada: $checked")
    }
}

// Ejemplo 14: FloatingActionButton
@Composable
fun FloatingActionButtonExample() {
    FloatingActionButton(onClick = {}) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}

// Ejemplo 15: Icon
@Composable
fun IconExample() {
    Icon(Icons.Default.Home, contentDescription = "Home")
}

// Ejemplo 16: Image (usa un recurso local si tienes)
@Composable
fun ImageExample() {
    // Si no tienes imagen en res/drawable, usa un icono
    Icon(Icons.Default.Star, contentDescription = "Star")
}

// Ejemplo 17: ProgressBar
@Composable
fun ProgressBarExample() {
    CircularProgressIndicator()
}

// Ejemplo 18: RadioButton
@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }
    Row {
        RadioButton(selected = selected, onClick = { selected = !selected })
        Text("Seleccionado: $selected")
    }
}

// Ejemplo 19: Slider
@Composable
fun SliderExample() {
    var value by remember { mutableStateOf(0f) }
    Column {
        Slider(value = value, onValueChange = { value = it })
        Text("Valor: $value")
    }
}

// Ejemplo 20: Spacer
@Composable
fun SpacerExample() {
    Column {
        Text("Arriba")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Abajo")
    }
}

// Ejemplo 21: Switch
@Composable
fun SwitchExample() {
    var checked by remember { mutableStateOf(false) }
    Switch(checked = checked, onCheckedChange = { checked = it })
}

// Ejemplo 22: TopAppBar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {
    TopAppBar(title = { Text("Soy un TopAppBar") })
}

// Ejemplo 23: BottomNavigation (simulado con Row)
@Composable
fun BottomNavigationExample() {
    Row {
        Text("Inicio", modifier = Modifier.padding(8.dp))
        Text("Buscar", modifier = Modifier.padding(8.dp))
        Text("Perfil", modifier = Modifier.padding(8.dp))
    }
}

// Ejemplo 24: Dialog
@Composable
fun DialogExample() {
    var open by remember { mutableStateOf(true) }
    if (open) {
        Dialog(onDismissRequest = { open = false }) {
            Surface(modifier = Modifier.padding(16.dp)) {
                Text("Soy un Dialog")
            }
        }
    }
}

// Ejemplo 25: Divider
@Composable
fun DividerExample() {
    Column {
        Text("Texto arriba")
        Divider()
        Text("Texto abajo")
    }
}

// Ejemplo 26: DropDownMenu
@Composable
fun DropDownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    Column {
        Button(onClick = { expanded = true }) { Text("Abrir menú") }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("Opción 1") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opción 2") }, onClick = { expanded = false })
        }
    }
}

// Ejemplo 27: LazyVerticalGrid (simulado con Column)
@Composable
fun LazyVerticalGridExample() {
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

// Ejemplo 28: NavigationRail (simulado)
@Composable
fun NavigationRailExample() {
    Column {
        Text("Inicio", modifier = Modifier.padding(8.dp))
        Text("Buscar", modifier = Modifier.padding(8.dp))
        Text("Perfil", modifier = Modifier.padding(8.dp))
    }
}

// Ejemplo 29: OutlinedTextField
@Composable
fun OutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(value = text, onValueChange = { text = it }, label = { Text("Nombre") })
}

// Ejemplo 30: Pager (solo placeholder)
@Composable
fun PagerExample() {
    Text("Pager requiere dependencia extra (Accompanist).")
}

// Ejemplo 31: Snackbar
@Composable
fun SnackbarExample() {
    Snackbar { Text("Soy un Snackbar") }
}

// Ejemplo 32: TabRow
@Composable
fun TabRowExample() {
    var selected by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2")
    TabRow(selectedTabIndex = selected) {
        titles.forEachIndexed { index, title ->
            Tab(selected = selected == index, onClick = { selected = index }, text = { Text(title) })
        }
    }
}

// Ejemplo 33: Tooltip (simulado)
@Composable
fun TooltipExample() {
    Text("Tooltip no está en Material3 todavía. Placeholder.")

}
// Ejemplo 34: Button
@Composable
fun ButtonExample() {
    Button(
        onClick = { println("Botón presionado!") },
        modifier = Modifier.padding(8.dp)
    ) {
        Text("Soy un botón")
    }
}
@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Ingresa texto") },
        placeholder = { Text("Escribe aquí...") },
        singleLine = true,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = Color.Gray,
            cursorColor = MaterialTheme.colorScheme.primary
        )
    )
}