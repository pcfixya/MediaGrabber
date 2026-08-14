package com.junkfood.seal.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.junkfood.seal.ui.common.LocalEmberDarkMode

/**
 * Common shape shared by [GradientDarkColors] and [EmberDarkColors] so call sites can read
 * `currentAccentColors()` once instead of branching on the active accent theme everywhere.
 */
interface AccentColorPalette {
    val Background: Color
    val Surface: Color
    val SurfaceVariant: Color
    val SurfaceContainer: Color
    val SurfaceContainerLow: Color
    val SurfaceContainerHigh: Color
    val GradientPrimaryStart: Color
    val GradientPrimaryEnd: Color
    val GradientSecondaryStart: Color
    val GradientSecondaryEnd: Color
    val GradientAccentStart: Color
    val GradientAccentEnd: Color
    val GlassWhiteBorder: Color
    val GlassSurface: Color
    val GlassSurfaceVariant: Color
    val OnBackground: Color
    val OnSurface: Color
    val OnSurfaceVariant: Color
    val OnPrimary: Color
    val OnSecondary: Color
    val BrightAccent1: Color
    val BrightAccent2: Color
    val BrightAccent3: Color
}

/** Common shape shared by [GradientBrushes] and [EmberBrushes]. */
interface AccentBrushPalette {
    val Primary: Brush
    val Secondary: Brush
    val Accent: Brush
    val Vibrant: Brush
}

@Composable
fun currentAccentColors(): AccentColorPalette =
    if (LocalEmberDarkMode.current) EmberDarkColors else GradientDarkColors

@Composable
fun currentAccentBrushes(): AccentBrushPalette =
    if (LocalEmberDarkMode.current) EmberBrushes else GradientBrushes
