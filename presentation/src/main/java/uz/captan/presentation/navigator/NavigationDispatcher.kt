package uz.captan.presentation.navigator

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.flow.MutableSharedFlow

import uz.captan.presentation.utils.AppScreen
import uz.captan.presentation.utils.NavigatorArg

class NavigationDispatcher : AppNavigator, NavigationHandler {
    override suspend fun back() = navigator {
        popAll()
    }

    override suspend fun navigateTo(screen: AppScreen) = navigator {
        push(screen)
    }

    override suspend fun replaceScreen(screen: AppScreen) = navigator {
        replace(screen)
    }

    private suspend fun navigator(arg: NavigatorArg) {
        navStack.emit(arg)
    }

    override val navStack = MutableSharedFlow<NavigatorArg>()

}