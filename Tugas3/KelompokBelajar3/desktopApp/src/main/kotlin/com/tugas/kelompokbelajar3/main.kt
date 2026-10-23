package com.tugas.kelompokbelajar3

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KelompokBelajar3",
    ) {
        App()
    }
}