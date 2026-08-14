package com.junkfood.seal.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * Ember Dark Theme Color Palette
 * Near-black warm-neutral backgrounds with neon orange-to-red gradients.
 * Mirrors [GradientDarkColors] token-for-token so it's a drop-in alternate accent theme.
 */
object EmberDarkColors : AccentColorPalette {
    // Backgrounds — warm-neutral near-black, OLED friendly
    override val Background = Color(0xFF0A0708)
    override val Surface = Color(0xFF17100F)
    override val SurfaceVariant = Color(0xFF1F1412)
    override val SurfaceContainer = Color(0xFF221614)
    override val SurfaceContainerLow = Color(0xFF150F0E)
    override val SurfaceContainerHigh = Color(0xFF2C1818)

    // Gradient accent pairs — orange → red
    override val GradientPrimaryStart = Color(0xFFFF7A18)
    override val GradientPrimaryEnd = Color(0xFFFF381F)
    override val GradientSecondaryStart = Color(0xFFE52830)
    override val GradientSecondaryEnd = Color(0xFFB3122A)
    override val GradientAccentStart = Color(0xFFFFB347)
    override val GradientAccentEnd = Color(0xFFFF4D2E)

    // Glassmorphism Colors — identical alphas to GradientDarkColors
    override val GlassWhiteBorder = Color(0x1AFFFFFF)
    override val GlassSurface = Color(0x0DFFFFFF)
    override val GlassSurfaceVariant = Color(0x1AFFFFFF)
    val GlassEmberBorder = Color(0x38FF7A18)

    // Text Colors — all pairs ≥ 4.5:1 (AA)
    override val OnBackground = Color(0xFFFAF7F6)
    override val OnSurface = Color(0xFFF5F0EE)
    override val OnSurfaceVariant = Color(0xFFC6B9B5)
    override val OnPrimary = Color(0xFF1A0A06)
    override val OnSecondary = Color(0xFFFFFFFF)

    // Additional Accent Colors
    val EmberAmber = Color(0xFFFFC468)
    val EmberOrangeBright = Color(0xFFFF8A4C)
    val EmberRedBright = Color(0xFFFF6A3F)
    override val BrightAccent1 = EmberAmber
    override val BrightAccent2 = EmberOrangeBright
    override val BrightAccent3 = EmberRedBright

    // Glow / elevation tint
    val GlowColor = Color(0xFFFF4D1A)
    val GlowSoft = Color(0x59FF4D1A)
}

/** Gradient brushes for primary, secondary, and accent colors — Ember variant. */
object EmberBrushes : AccentBrushPalette {
    override val Primary = Brush.linearGradient(
        colors = listOf(
            EmberDarkColors.GradientPrimaryStart,
            EmberDarkColors.GradientPrimaryEnd
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )

    override val Secondary = Brush.linearGradient(
        colors = listOf(
            EmberDarkColors.GradientSecondaryStart,
            EmberDarkColors.GradientSecondaryEnd,
            EmberDarkColors.GradientAccentStart
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )

    override val Accent = Brush.linearGradient(
        colors = listOf(
            EmberDarkColors.GradientAccentStart,
            EmberDarkColors.GradientAccentEnd
        ),
        start = Offset(0f, 0f),
        end = Offset(Float.POSITIVE_INFINITY, 0f)
    )

    override val Vibrant = Brush.linearGradient(
        colors = listOf(
            EmberDarkColors.EmberAmber,
            EmberDarkColors.EmberOrangeBright,
            EmberDarkColors.GradientAccentEnd
        )
    )
}
