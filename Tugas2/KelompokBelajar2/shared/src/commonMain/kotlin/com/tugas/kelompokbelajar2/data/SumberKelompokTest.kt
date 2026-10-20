package com.tugas.kelompokbelajar2.data

import com.tugas.kelompokbelajar2.model.MataKuliah
import com.tugas.kelompokbelajar2.model.StatusKelompok
import com.tugas.kelompokbelajar2.model.KelompokBelajar
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun contohKelompok(id: Int, status: StatusKelompok = StatusKelompok.Dibuka) = KelompokBelajar(
    id = id,
    nama = "isi",
    mataKuliah = MataKuliah("isi", "isi", 3),
    lokasi = "isi",
    tautanGrup = null,
    status = status
)

class SumberKelompokTest : Sumber<KelompokBelajar> {

    override suspend fun ambil(id: Int): KelompokBelajar {
        delay(1000)
        return contohKelompok(id)
    }

    override fun pantau(id: Int): Flow<KelompokBelajar> = flow {
        emit(contohKelompok(id, StatusKelompok.Dibuka))
        delay(1500)
        emit(contohKelompok(id, StatusKelompok.Berjalan(pertemuanKe = 1)))
        delay(2000)
        emit(contohKelompok(id, StatusKelompok.Selesai("Materi 2 selesai")))
    }
}