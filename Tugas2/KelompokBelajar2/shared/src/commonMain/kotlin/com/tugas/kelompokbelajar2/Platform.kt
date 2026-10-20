package com.tugas.kelompokbelajar2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform