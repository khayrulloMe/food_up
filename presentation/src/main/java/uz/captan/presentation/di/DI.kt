package uz.captan.presentation.di

import cafe.adriel.voyager.core.registry.ScreenRegistry
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.dsl.module
import uz.captan.presentation.navigator.AppNavigator
import uz.captan.presentation.navigator.NavigationDispatcher
import uz.captan.presentation.navigator.NavigationHandler
import uz.captan.presentation.navigator.SharedScreen
import uz.captan.presentation.navigator.diraction.AuthScreenDirection
import uz.captan.presentation.navigator.diraction.AuthScreenDirectionImpl
import uz.captan.presentation.vm.auth.sign_in.SignInContract
import uz.captan.presentation.vm.auth.sign_in.SignInViewModel

object DI {
    val navigation = module {
        single<NavigationDispatcher> {
            NavigationDispatcher()

        }


        single<AppNavigator>() {
            get<NavigationDispatcher>()
        }
        single<NavigationHandler>() {
            get<NavigationDispatcher>()
        }
        factory<AuthScreenDirection> {
            get<AuthScreenDirectionImpl>()
        }

    }
    val viewModel = module {
        viewModelOf(::SignInViewModel) {
            bind<SignInContract.ViewModel>()
        }
    }
}