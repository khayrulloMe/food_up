package uz.captan.food_up.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import uz.captan.food_up.utils.AppScreen

class HomeScreen : AppScreen() {
    @Composable
    override fun Content() {
        HomeScreenContent()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenContent() {
    Scaffold() {
        Column(modifier = Modifier.padding(it), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = "HomeScreen1")
            Text(text = "HomeScreen2")
            Text(text = "HomeScreen3")
        }
    }
}