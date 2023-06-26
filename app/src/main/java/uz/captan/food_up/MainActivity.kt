package uz.captan.food_up

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.android.ext.android.get
import uz.captan.food_up.navigator.NavigationDispatcher
import uz.captan.food_up.navigator.NavigationHandler
import uz.captan.food_up.ui.screen.HomeScreen
import uz.captan.food_up.ui.theme.FoodUpTheme


class MainActivity : ComponentActivity() {
    private var navigationHandler: NavigationHandler = get<NavigationDispatcher>()

    @SuppressLint("FlowOperatorInvokedInComposition", "CoroutineCreationDuringComposition")
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FoodUpTheme {
                Navigator(screen = HomeScreen(),
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
