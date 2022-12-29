/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

////updated colors from the material theme builder
//val AppDarkColorScheme = darkColorScheme(
//    background = Color(0xfff4fff6),
//    surface = Color(0xfff4fff6),
//    onSurface = Color(0xff002114),
//    primary = Color(0xff00687b),
//    onPrimary = Color(0xffffffff),
//    secondary = Color(0xff285ea7)
//)
//
//val AppLightColorScheme = lightColorScheme(
//    background = Color(0xff002114),
//    surface = Color(0xff002114),
//    onSurface = Color(0xff8bf8c4),
//    primary = Color(0xff57d6f6),
//    onPrimary = Color(0xff003641),
//    secondary = Color(0xffa9c7ff)
//)

private val AppDarkColorScheme = darkColorScheme(
    background = Cyan900,
    surface = Cyan700,
    onSurface = White,
    primary = Grey900,
    onPrimary = White,
    secondary = Grey100
)

private val AppLightColorScheme = lightColorScheme(
    background = Green100,
    surface = Green50,
    onSurface = Grey900,
    primary = Grey50,
    onPrimary = Grey900,
    secondary = Grey700
)

@Composable
fun WoofTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val AppColorScheme = if (darkTheme) {
        AppDarkColorScheme
    } else {
        AppLightColorScheme
    }

    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}
