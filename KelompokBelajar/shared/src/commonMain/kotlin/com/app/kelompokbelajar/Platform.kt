package com.app.kelompokbelajar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform