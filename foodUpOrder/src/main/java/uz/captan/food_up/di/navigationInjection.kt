package uz.captan.food_up.di

import cafe.adriel.voyager.core.registry.ScreenRegistry.register
import org.koin.dsl.module
import uz.captan.food_up.ui.screen.auth.SignInScreen
import uz.captan.food_up.ui.screen.home.HomeScreen
import uz.captan.presentation.di.DI

import uz.captan.presentation.navigator.SharedScreen

val navigationInjector = module {
    includes(DI.viewModel)
    includes(DI.navigation)
}