package com.example.whatsappfe.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappfe.ui.components.AppBarComponent
import com.example.whatsappfe.ui.components.TabComponent

@Composable
fun HomeScreen() {
    Column {
        AppBarComponent()
        TabComponent()
    }
}

@Preview
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}