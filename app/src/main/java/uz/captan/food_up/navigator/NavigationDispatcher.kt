package uz.captan.food_up.navigator

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import uz.captan.food_up.utils.AppScreen
import uz.captan.food_up.utils.NavigatorArg

class NavigationDispatcher : AppNavigator, NavigationHandler {
    override suspend fun back() = navigator {
        popAll()
    }

    override suspend fun toScreen(screen: AppScreen) = navigator {
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