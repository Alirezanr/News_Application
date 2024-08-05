package com.alireza.newsApp.core.presentation.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Define values as a data class.
 */
data class Spacing(
    val default: Dp = 0.dp,
    val extraSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 16.dp,
    val large: Dp = 32.dp,
    val extraLarge: Dp = 64.dp
)

/**
 * Use defined values as composition local.
 */
val LocalSpacing = compositionLocalOf { Spacing() }

/**
 *Extend MaterialTheme and add spacing property to it.
 *Use spacing (like color, typography,etc) to access defined values.
 **/
val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current