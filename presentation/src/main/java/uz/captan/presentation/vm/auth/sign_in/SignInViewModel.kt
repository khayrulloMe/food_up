package uz.captan.presentation.vm.auth.sign_in

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import uz.captan.presentation.navigator.AppNavigator

class SignInViewModel(
    private val navigator: AppNavigator
) : SignInContract.ViewModel, ViewModel() {
    override val uiState = MutableSharedFlow<String>(replay = 1, onBufferOverflow = BufferOverflow.DROP_LATEST)


    override fun onEventDispatcher(intent: SignInContract.Intent) = intent {
        when (intent) {
            is SignInContract.Intent.SingIn -> {

            }
        }
    }

    override val container: Container<SignInContract.UiState, SignInContract.SideEffect> = container(SignInContract.UiState.Loading)


}