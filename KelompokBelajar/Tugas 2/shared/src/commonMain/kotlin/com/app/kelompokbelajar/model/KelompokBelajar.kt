package com.app.kelompokbelajar.model

data class KelompokBelajar(
    val id: Int,
    val nama: String,
    val matakuliah: Matakuliah,
    val lokasi: String,
    val tautanGrup: String?,
    val status: Status = Status.Dibuka
)
