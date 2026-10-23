package com.tugas.kelompokbelajar3.model

sealed class StatusKelompok {
    data object Dibuka : StatusKelompok()

    data class Berjalan(val pertemuanKe: Int) : StatusKelompok()

    data class Selesai(val ringkasan: String) : StatusKelompok()
}