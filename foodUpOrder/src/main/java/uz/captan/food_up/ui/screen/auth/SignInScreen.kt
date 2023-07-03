package uz.captan.food_up.ui.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import uz.captan.food_up.utils.AppScreen

class SignInScreen : AppScreen() {
    @Composable
    override fun Content() {
        SignInScreenContent()
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SignInScreenContent() {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text(text = "SignIn Screen") })
            },

            ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {

                    },
                    modifier = Modifier.padding(8.dp),
                ) {

                    Text(text = "Go HomeScreen")
                }

            }
        }
    }

}