package com.app.kelompokbelajar.data

import com.app.kelompokbelajar.model.KelompokBelajar
import com.app.kelompokbelajar.model.Matakuliah
import com.app.kelompokbelajar.model.Status
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object DataMatakuliah {
    val pam = Matakuliah("IF25-22017", "Pengembangan Aplikasi Mobile", 3)
    val alpro = Matakuliah("IF25-11001", "Algoritma dan Pemrograman", 2)
    val asd = Matakuliah("IF25-12003", "Algoritma dan Struktur Data", 4)
    val basdat = Matakuliah("IF25-21012", "Basis Data", 3)
    val pbo = Matakuliah("IF25-21009", "Pemrograman Berorientasi Objek", 3)
    val jarkom = Matakuliah("IF25-21008", "Jaringan Komputer", 3)
    val matdis = Matakuliah("IF25-12004", "Matematika Diskrit", 4)

    val daftar = listOf(pam, alpro, asd, basdat, pbo, jarkom, matdis)
}

object PenyimpananKelompok {
    private val _daftar = MutableStateFlow(daftarKelompokContoh)

    val daftar: StateFlow<List<KelompokBelajar>> = _daftar.asStateFlow()

    fun tambah(nama: String, lokasi: String, tautanGrup: String?, matakuliah: Matakuliah) {
        _daftar.update { lama ->
            lama + KelompokBelajar(
                id = if (lama.isEmpty()) 1 else lama.maxOf { it.id } + 1,
                nama = nama,
                lokasi = lokasi,
                matakuliah = matakuliah,
                tautanGrup = if (tautanGrup.isNullOrBlank()) null else tautanGrup,
                status = Status.Dibuka
            )
        }
    }
}