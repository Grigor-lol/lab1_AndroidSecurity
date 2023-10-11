package com.example.makeitso.screens.profile

import androidx.compose.runtime.mutableStateOf
import com.example.makeitso.PROFILE_USER_SCREEN
import com.example.makeitso.R
import com.example.makeitso.SETTINGS_SCREEN
import com.example.makeitso.SIGN_UP_SCREEN
import com.example.makeitso.TASKS_SCREEN
import com.example.makeitso.common.ext.isValidEmail
import com.example.makeitso.common.ext.isValidPassword
import com.example.makeitso.common.ext.passwordMatches
import com.example.makeitso.common.snackbar.SnackbarManager
import com.example.makeitso.model.service.AccountService
import com.example.makeitso.model.service.LogService
import com.example.makeitso.model.service.StorageService
import com.example.makeitso.screens.MakeItSoViewModel
import com.example.makeitso.screens.sign_up.SignUpUiState
import javax.inject.Inject

class ProfileViewModel @Inject constructor (
    logService: LogService,
    private val accountService: AccountService,
    private val storageService: StorageService
) : MakeItSoViewModel(logService) {
    var uiState = mutableStateOf(ProfileUiState())
        private set

    private val displayName
        get() = uiState.value.displayName
    private val authMethod
        get() = uiState.value.authMethod

    fun onDisplayNameChange(newValue: String) {
        uiState.value = uiState.value.copy(displayName = newValue)
    }

    fun onAuthMethodChange(newValue: String) {
        uiState.value = uiState.value.copy(authMethod = newValue)
    }

    fun onProfileClick(openAndPopUp: (String, String) -> Unit) {
        launchCatching {
            openAndPopUp(TASKS_SCREEN, PROFILE_USER_SCREEN)
        }
    }
}