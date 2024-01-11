package dev.arvind.livechat.screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import dev.arvind.livechat.DestinationScreen
import dev.arvind.livechat.LCMViewModel

@Composable
fun SignUpScreen(navController: NavController, viewModel: LCMViewModel) {

    Text(text = "Navigation to other screen",
        modifier = Modifier.clickable {
            navController.navigate(DestinationScreen.Login.route)
        })
}