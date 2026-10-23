package com.tugas.kelompokbelajar3

import com.tugas.kelompokbelajar3.data.SumberKelompokTest
import com.tugas.kelompokbelajar3.model.infoGrup
import com.tugas.kelompokbelajar3.model.label
import com.tugas.kelompokbelajar3.model.ringkas
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val sumber = SumberKelompokTest()

    val kelompok = sumber.ambil(1)
    println(kelompok.ringkas())
    println("Grup: ${kelompok.infoGrup()}")
    println("--- Memantau perubahan status ---")

    sumber.pantau(1)
        .map { it.status.label() }
        .onEach { println("Log: $it") }
        .collect { println("Notifikasi: $it") }

    println("Selesai memantau")
}
