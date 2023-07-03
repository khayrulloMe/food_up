package uz.captan.presentation.navigator.diraction

import cafe.adriel.voyager.androidx.AndroidScreen
import uz.captan.presentation.navigator.AppNavigator
import uz.captan.presentation.utils.AppScreen

class AuthScreenDirectionImpl(private val appNavigation: AppNavigator) : AuthScreenDirection {
    override suspend fun homeScreen(token: String) {
        appNavigation.navigateTo()
    }
}