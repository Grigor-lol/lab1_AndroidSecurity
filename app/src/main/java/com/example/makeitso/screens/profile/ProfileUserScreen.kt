package com.example.makeitso.screens.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.makeitso.screens.tasks.TasksViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
@ExperimentalMaterialApi
fun ProfileUserScreen(
    //openScreen: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Имя пользователя: ${uiState.displayName}")
        // Вставьте код для отображения аватара, например, с использованием Coil
        // Или используйте Composable для загрузки изображения
        // Image(
        //     painter = rememberImagePainter(data = userAvatarUrl),
        //     contentDescription = "Аватар пользователя"
        // )
        Text(text = "Метод аутентификации: Email") // Здесь можно заменить на метод аутентификации, используемый пользователем
    }
}
