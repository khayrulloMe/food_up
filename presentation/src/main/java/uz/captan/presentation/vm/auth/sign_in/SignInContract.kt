package uz.captan.presentation.vm.auth.sign_in

import kotlinx.coroutines.flow.Flow
import uz.captan.presentation.utils.AppViewModel

interface SignInContract {
    interface ViewModel : AppViewModel<Intent, UiState, SideEffect> {
        val uiState: Flow<String>
    }

    sealed interface Intent {
        data class SingIn(
            val token: String
        ) : Intent

    }

    sealed interface UiState {
        data class Init(
            val token: String
        ) : UiState
        object Loading: UiState
    }
    sealed interface SideEffect {
        data class Init(
            val token: String
        ) : UiState
    }
}