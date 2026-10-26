package com.app.kelompokbelajar.data

import com.app.kelompokbelajar.model.KelompokBelajar
import com.app.kelompokbelajar.model.Matakuliah
import com.app.kelompokbelajar.model.Status
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object PenyimpananKelompok {
    private val _daftar = MutableStateFlow(listOf<KelompokBelajar>(
        KelompokBelajar(
            id = 1,
            nama = "Pejuang Mobile",
            matakuliah = Matakuliah("IF25-22017", "Pengembangan Aplikasi Mobile", 3),
            lokasi = "GKU1 201",
            tautanGrup = null,
            status = Status.Dibuka
        )
    ))

    val daftar: StateFlow<List<KelompokBelajar>> = _daftar.asStateFlow()

    fun tambah(nama: String, lokasi: String) {
        _daftar.update { lama ->
            lama + KelompokBelajar(
                id = lama.size + 1,
                nama = nama,
                lokasi = lokasi,
                matakuliah =  Matakuliah(kode = "-", nama = "Belum ditentukan", sks = 0),
                tautanGrup = null,
                status = Status.Dibuka
            )
        }
    }
}