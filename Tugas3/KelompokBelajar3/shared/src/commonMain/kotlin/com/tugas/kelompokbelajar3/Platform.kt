package com.tugas.kelompokbelajar3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform