package com.example.whatsappfe.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComposable(
    value: String,
    fontSize: TextUnit,
    color: Color,
    modifier: Modifier?,
    fontWeight: FontWeight? = FontWeight.Normal
) {
    if (modifier != null) {
        Text(
            modifier = modifier,
            text = value,
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color
        )
    }else{
        Text(
            text = value,
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color
        )
    }
}