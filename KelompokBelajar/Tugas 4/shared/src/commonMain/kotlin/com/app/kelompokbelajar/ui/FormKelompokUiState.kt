package com.app.kelompokbelajar.ui

import com.app.kelompokbelajar.model.Matakuliah

data class FormKelompokUiState(
    val nama: String = "",
    val lokasi: String = "",
    val tautanGrup: String = "",
    val matakuliah: Matakuliah = Matakuliah(kode = "-", nama = "Belum ditentukan", sks = 0),
    val sedangMengirim: Boolean = false,
    val pesan: String? = null
) {
    val bisaSimpan: Boolean
        get() = nama.isNotBlank() && lokasi.isNotBlank() && !sedangMengirim
}