package uz.captan

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import uz.captan.food_up.di.navigationInjector
import uz.captan.food_up.ui.screen.auth.SignInScreen
import uz.captan.food_up.ui.screen.home.HomeScreen
import uz.captan.presentation.navigator.SharedScreen

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(navigationInjector)

        }

    }
}