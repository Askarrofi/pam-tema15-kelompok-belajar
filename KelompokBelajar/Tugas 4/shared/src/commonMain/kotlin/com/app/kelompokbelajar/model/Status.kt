package com.app.kelompokbelajar.model

fun Status.label(): String = when (this) {
    Status.Dibuka -> "Pendaftaran Dibuka"
    is Status.Berjalan -> "Sedang Berjalan (Pertemuan ke-$pertemuanKe)"
    is Status.Selesai -> "Selesai: $ringkasan"
}
sealed class Status{
    data object Dibuka : Status()

    data class Berjalan(val pertemuanKe: Int) : Status()

    data class Selesai(val ringkasan: String) : Status()
}
