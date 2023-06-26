package uz.captan.food_up.di
import org.koin.dsl.module
import uz.captan.food_up.navigator.AppNavigator
import uz.captan.food_up.navigator.NavigationDispatcher
import uz.captan.food_up.navigator.NavigationHandler

val navigationInjector = module {
    single<NavigationDispatcher> {
        NavigationDispatcher()

    }
    single<AppNavigator>() {
        get<NavigationDispatcher>()
    }
    single<NavigationHandler>() {
        get<NavigationDispatcher>()
    }

}