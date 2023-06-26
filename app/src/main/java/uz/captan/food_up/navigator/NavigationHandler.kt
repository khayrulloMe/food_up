package uz.captan.food_up.navigator

import kotlinx.coroutines.flow.Flow
import uz.captan.food_up.utils.NavigatorArg

interface NavigationHandler {
    val navStack: Flow<NavigatorArg>

}