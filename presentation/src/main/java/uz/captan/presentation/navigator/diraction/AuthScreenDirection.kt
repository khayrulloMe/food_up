package uz.captan.presentation.navigator.diraction

interface AuthScreenDirection {

    suspend fun homeScreen(token: String)
}