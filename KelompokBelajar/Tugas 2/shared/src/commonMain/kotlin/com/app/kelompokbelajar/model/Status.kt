package com.app.kelompokbelajar.model

sealed class Status{
    data object Dibuka : Status()

    data class Berjalan(val pertemuanKe: Int) : Status()

    data class Selesai(val ringkasan: String) : Status()
}
