package com.tugas.kelompokbelajar2.model

fun StatusKelompok.label(): String = when (this) {
    StatusKelompok.Dibuka -> "Menunggu anggota"
    is StatusKelompok.Berjalan -> "Pertemuan ke-$pertemuanKe berlangsung"
    is StatusKelompok.Selesai -> "Selesai: $ringkasan"
}

fun KelompokBelajar.ringkas(): String =
    "#$id $nama (${mataKuliah.nama}), $lokasi"

fun KelompokBelajar.infoGrup(): String = tautanGrup ?: "Belum ada grup"
