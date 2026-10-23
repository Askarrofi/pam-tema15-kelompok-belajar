package com.tugas.kelompokbelajar3.data

import com.tugas.kelompokbelajar3.model.KelompokBelajar
import com.tugas.kelompokbelajar3.model.MataKuliah
import com.tugas.kelompokbelajar3.model.StatusKelompok

private val pam = MataKuliah("IF25-22017", "Pengembangan Aplikasi Mobile", 3)
private val alpro = MataKuliah("IF25-11001", "Algoritma dan Pemrograman", 2)
private val asd = MataKuliah("IF25-12003", "Algoritma dan Struktur Data", 4)
private val basdat = MataKuliah("IF25-21012", "Basis Data", 3)
private val pbo = MataKuliah("IF25-21009", "Pemrograman Berorientasi Objek", 3)
private val jarkom = MataKuliah("IF25-21008", "Jaringan Komputer", 3)
private val matdis = MataKuliah("IF25-12004", "Matematika Diskrit", 4)

val daftarKelompokContoh: List<KelompokBelajar> = listOf(
    KelompokBelajar(1, "Pejuang Mobile", pam, "GKU1 201", null),
    KelompokBelajar(2, "ASD Santuy", asd, "Perpustakaan GKU2", null, StatusKelompok.Berjalan(2)),
    KelompokBelajar(3, "Alpro Pagi", alpro, "GKU2 305", null, StatusKelompok.Selesai("Bab 1 sampai 3 selesai")),
    KelompokBelajar(4, "Basdat Malam", basdat, "Online (Discord)", "https://youtu.be/dQw4w9WgXcQ?si=1x9aw_zYqwdpLDeQ"),
    KelompokBelajar(5, "Matdis Kamis Sore", matdis, "GKU2 225", null, StatusKelompok.Berjalan(5)),
    KelompokBelajar(6, "Jarkom Cisco Squad", jarkom, "Lab IoT Labtek 3", null),
    KelompokBelajar(7, "Persiapan UTS PBO", pbo, "Labkom 2 Labtek 1", null, StatusKelompok.Selesai("Latihan soal UTS selesai")),
    KelompokBelajar(8, "PAM Kelompok Pagi", pam, "Kantin RK", null, StatusKelompok.Berjalan(1)),
    KelompokBelajar(9, "Alpro Bareng", alpro, "GKU1 106", null),
    KelompokBelajar(10, "Basdat Query Club", basdat, "GK1 208", null, StatusKelompok.Berjalan(4)),
    KelompokBelajar(11, "Matdis Pemula", matdis, "Online (Google Meet)", null),
    KelompokBelajar(12, "Jarkom Kita Balas di UAS", jarkom, "Ruang TA Labtek 3", null, StatusKelompok.Selesai("Semua modul sudah dibahas"))
)