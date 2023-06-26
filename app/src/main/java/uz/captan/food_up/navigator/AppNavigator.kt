package uz.captan.food_up.navigator

import cafe.adriel.voyager.androidx.AndroidScreen
import uz.captan.food_up.utils.AppScreen

interface AppNavigator {
    suspend fun back()
    suspend fun toScreen(screen: AppScreen)
    suspend fun replaceScreen(screen: AppScreen)
}