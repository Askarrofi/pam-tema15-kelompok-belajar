package com.tugas.kelompokbelajar2

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KelompokBelajar2",
    ) {
        App()
    }
}