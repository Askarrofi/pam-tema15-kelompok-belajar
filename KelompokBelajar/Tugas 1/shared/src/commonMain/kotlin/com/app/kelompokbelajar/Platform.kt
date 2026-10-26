package com.app.kelompokbelajar

expect fun namaPlatform(): String

fun sapaan(): String =
    "Platform: ${namaPlatform()}"