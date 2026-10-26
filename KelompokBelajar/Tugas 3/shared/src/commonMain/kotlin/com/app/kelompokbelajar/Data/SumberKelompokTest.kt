package com.app.kelompokbelajar.Data


import com.app.kelompokbelajar.model.Matakuliah
import com.app.kelompokbelajar.model.Status
import com.app.kelompokbelajar.model.KelompokBelajar
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun contohKelompok(id: Int, status: Status = Status.Dibuka) = KelompokBelajar(
    id = id,
    nama = "isi",
    matakuliah = Matakuliah("IF25-22017", "Pengembangan Aplikasi Mobile", 3),
    lokasi = "GK1.208",
    tautanGrup = null,
    status = status
)

class SumberKelompokTest : Sumber<KelompokBelajar> {

    override suspend fun ambil(id: Int): KelompokBelajar {
        delay(1000)
        return contohKelompok(id)
    }

    override fun pantau(id: Int): Flow<KelompokBelajar> = flow {
        emit(contohKelompok(id, Status.Dibuka))
        delay(1500)
        emit(contohKelompok(id, Status.Berjalan(pertemuanKe = 1)))
        delay(2000)
        emit(contohKelompok(id, Status.Selesai("Materi 2 selesai")))
    }
}