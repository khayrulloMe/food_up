package uz.captan.presentation.navigator

import kotlinx.coroutines.flow.Flow
import uz.captan.presentation.utils.NavigatorArg

interface NavigationHandler {
    val navStack: Flow<NavigatorArg>

}