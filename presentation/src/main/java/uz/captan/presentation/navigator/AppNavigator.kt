package uz.captan.presentation.navigator

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.androidx.AndroidScreen
import uz.captan.presentation.utils.AppScreen


interface AppNavigator {
    suspend fun back()
    suspend fun navigateTo(screen: AppScreen)
    suspend fun replaceScreen(screen: AppScreen)
}