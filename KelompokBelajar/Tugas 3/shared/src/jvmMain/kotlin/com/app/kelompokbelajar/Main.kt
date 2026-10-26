package com.app.kelompokbelajar

import com.app.kelompokbelajar.Data.SumberKelompokTest
import com.app.kelompokbelajar.model.KelompokBelajar
import com.app.kelompokbelajar.model.Status
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun Status.label(): String = when (this) {
    Status.Dibuka -> "Pendaftaran Dibuka"
    is Status.Berjalan -> "Sedang Berjalan (Pertemuan ke-$pertemuanKe)"
    is Status.Selesai -> "Selesai: $ringkasan"
}

fun KelompokBelajar.ringkas(): String {
    return "Kelompok: $nama - Matkul: ${matakuliah.nama}"
}

fun KelompokBelajar.infoGrup(): String {
    return tautanGrup ?: "Belum ada tautan grup"
}

fun main() = runBlocking {
    val sumber = SumberKelompokTest()

    val kelompok = sumber.ambil(id = 1)

    println(kelompok.ringkas())
    println("Grup: ${kelompok.infoGrup()}")

    println("\n--- Memantau perubahan status ---")

    sumber.pantau(id = 1)
        .map { it.status.label() }
        .onEach { println("Log: $it") }
        .collect { println("Notifikasi: $it") }

    println("Selesai memantau")
}