package com.example.lab04.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab04.components.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    var selected by remember { mutableStateOf<String?>(null) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Exploración de Componentes") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()) // para poder scrollear el menú
        ) {
            if (selected == null) {
                // Menú de botones
                Text("Selecciona un ejemplo:", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(16.dp))

                val ejemplos = listOf(
                    // Contenedores
                    "LazyColumn", "LazyRow", "Grid", "ConstraintLayout", "Scaffold",
                    "Surface", "Chip", "BackdropScaffold", "FlowRow", "FlowColumn",

                    // Controles
                    "AlertDialog", "Card", "Checkbox", "FloatingActionButton", "Icon",
                    "Image", "ProgressBar", "RadioButton", "Slider", "Spacer",
                    "Switch", "TopAppBar",

                    // Controles extra
                    "BottomNavigation", "Dialog", "Divider", "DropDownMenu",
                    "LazyVerticalGrid", "NavigationRail", "OutlinedTextField",
                    "Pager", "Snackbar", "TabRow", "Tooltip", "Button", "TextField", "ViewHolaCurso"

                )

                ejemplos.forEach { ejemplo ->
                    Button(
                        onClick = { selected = ejemplo },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(ejemplo)
                    }
                }

            } else {
                // Mostrar el composable seleccionado
                when (selected) {
                    "LazyColumn" -> LazyColumnExample()
                    "LazyRow" -> LazyRowExample()
                    "Grid" -> GridExample()
                    "ConstraintLayout" -> ConstraintLayoutExample()
                    "Scaffold" -> ScaffoldExample()
                    "Surface" -> SurfaceExample()
                    "Chip" -> ChipExample()
                    "BackdropScaffold" -> BackdropScaffoldExample()
                    "FlowRow" -> FlowRowExample()
                    "FlowColumn" -> FlowColumnExample()

                    "AlertDialog" -> AlertDialogExample()
                    "Card" -> CardExample()
                    "Checkbox" -> CheckboxExample()
                    "FloatingActionButton" -> FloatingActionButtonExample()
                    "Icon" -> IconExample()
                    "Image" -> ImageExample()
                    "ProgressBar" -> ProgressBarExample()
                    "RadioButton" -> RadioButtonExample()
                    "Slider" -> SliderExample()
                    "Spacer" -> SpacerExample()
                    "Switch" -> SwitchExample()
                    "TopAppBar" -> TopAppBarExample()

                    "BottomNavigation" -> BottomNavigationExample()
                    "Dialog" -> DialogExample()
                    "Divider" -> DividerExample()
                    "DropDownMenu" -> DropDownMenuExample()
                    "LazyVerticalGrid" -> LazyVerticalGridExample()
                    "NavigationRail" -> NavigationRailExample()
                    "OutlinedTextField" -> OutlinedTextFieldExample()
                    "Pager" -> PagerExample()
                    "Snackbar" -> SnackbarExample()
                    "TabRow" -> TabRowExample()
                    "Tooltip" -> TooltipExample()
                    "Button" -> ButtonExample()
                    "TextField" -> TextFieldExample()
                    "ViewHolaCurso" -> ViewHolaCurso()
                }

                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { selected = null }, modifier = Modifier.fillMaxWidth()) {
                    Text("Volver al menú")
                }
            }
        }
    }
}
