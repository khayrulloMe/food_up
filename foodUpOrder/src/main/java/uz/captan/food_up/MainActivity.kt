package uz.captan.food_up

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.android.ext.android.get
import uz.captan.presentation.navigator.NavigationDispatcher
import uz.captan.presentation.navigator.NavigationHandler
import uz.captan.food_up.ui.screen.auth.SignInScreen
import uz.captan.food_up.ui.theme.FoodUpTheme


class MainActivity : ComponentActivity() {
    private var navigationHandler: NavigationHandler = get<NavigationDispatcher>()

    @SuppressLint("FlowOperatorInvokedInComposition", "CoroutineCreationDuringComposition")
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FoodUpTheme {
                Navigator(screen = SignInScreen(),
                    onBackPressed = {
                        true
                    }
                ) { navigator ->
                    navigationHandler.navStack
                        .onEach {
                            it.invoke(navigator)
                        }.launchIn(lifecycleScope)
                    SlideTransition(navigator)
                }


            }
        }
    }
}
