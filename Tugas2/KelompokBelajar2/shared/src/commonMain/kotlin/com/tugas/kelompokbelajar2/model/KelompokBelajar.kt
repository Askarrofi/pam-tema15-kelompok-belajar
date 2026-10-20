package com.tugas.kelompokbelajar2.model

data class KelompokBelajar(
    val id: Int,
    val nama: String,
    val mataKuliah: MataKuliah,
    val lokasi: String,
    val tautanGrup: String?,
    val status: StatusKelompok = StatusKelompok.Dibuka
)