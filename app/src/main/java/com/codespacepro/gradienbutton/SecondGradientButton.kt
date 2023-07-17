package com.codespacepro.gradienbutton


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SecondGradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(contentColor = Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { onClick() }) {

        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor)
        }
    }

}

@Composable
@Preview
fun SecondGradientPreview() {
    SecondGradientButton(
        "Button Clicked", textColor = Color.White, gradient = Brush.horizontalGradient(
            listOf(colorResource(id = R.color.purple_700), colorResource(id = R.color.teal_200))
        ), onClick = { null }
    )
}