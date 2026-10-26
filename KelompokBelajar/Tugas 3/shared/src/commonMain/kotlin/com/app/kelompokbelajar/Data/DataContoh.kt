package com.app.kelompokbelajar.Data

import com.app.kelompokbelajar.model.KelompokBelajar
import com.app.kelompokbelajar.model.Matakuliah
import com.app.kelompokbelajar.model.Status

private val pam = Matakuliah("IF25-22017", "Pengembangan Aplikasi Mobile", 3)
private val alpro = Matakuliah("IF25-11001", "Algoritma dan Pemrograman", 2)
private val asd = Matakuliah("IF25-12003", "Algoritma dan Struktur Data", 4)
private val basdat = Matakuliah("IF25-21012", "Basis Data", 3)
private val pbo = Matakuliah("IF25-21009", "Pemrograman Berorientasi Objek", 3)
private val jarkom = Matakuliah("IF25-21008", "Jaringan Komputer", 3)
private val matdis = Matakuliah("IF25-12004", "Matematika Diskrit", 4)

val daftarKelompokContoh: List<KelompokBelajar> = listOf(
    KelompokBelajar(1, "Pejuang Mobile", pam, "GKU1 201", null),
    KelompokBelajar(2, "ASD Santuy", asd, "Perpustakaan GKU2", null, Status.Berjalan(2)),
    KelompokBelajar(3, "Alpro Pagi", alpro, "GKU2 305", null, Status.Selesai("Bab 1 sampai 3 selesai")),
    KelompokBelajar(4, "Basdat Malam", basdat, "Online (Discord)", "https://youtu.be/dQw4w9WgXcQ?si=1x9aw_zYqwdpLDeQ"),
    KelompokBelajar(5, "Matdis Kamis Sore", matdis, "GKU2 225", null, Status.Berjalan(5)),
    KelompokBelajar(6, "Jarkom Cisco Squad", jarkom, "Lab IoT Labtek 3", null),
    KelompokBelajar(7, "Persiapan UTS PBO", pbo, "Labkom 2 Labtek 1", null, Status.Selesai("Latihan soal UTS selesai")),
    KelompokBelajar(8, "PAM Kelompok Pagi", pam, "Kantin RK", null, Status.Berjalan(1)),
    KelompokBelajar(9, "Alpro Bareng", alpro, "GKU1 106", null),
    KelompokBelajar(10, "Basdat Query Club", basdat, "GK1 208", null, Status.Berjalan(4)),
    KelompokBelajar(11, "Matdis Pemula", matdis, "Online (Google Meet)", null),
    KelompokBelajar(12, "Jarkom Kita Balas di UAS", jarkom, "Ruang TA Labtek 3", null, Status.Selesai("Semua modul sudah dibahas"))
)