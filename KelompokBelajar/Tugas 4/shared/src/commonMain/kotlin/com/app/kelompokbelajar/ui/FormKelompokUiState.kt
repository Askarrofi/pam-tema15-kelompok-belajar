package com.app.kelompokbelajar.ui

data class FormKelompokUiState(
    val nama: String = "",
    val lokasi: String = "",
    val sedangMengirim: Boolean = false,
    val pesan: String? = null
) {
    val bisaSimpan: Boolean
        get() = nama.isNotBlank() && lokasi.isNotBlank() && !sedangMengirim
}