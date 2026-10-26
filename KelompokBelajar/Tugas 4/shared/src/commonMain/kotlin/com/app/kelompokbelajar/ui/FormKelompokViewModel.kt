package com.app.kelompokbelajar.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.kelompokbelajar.data.PenyimpananKelompok
import com.app.kelompokbelajar.model.Matakuliah
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class FormKelompokViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(FormKelompokUiState())
    val uiState = _uiState.asStateFlow()

    fun ubahNama(teks: String) {
        _uiState.update { it.copy(nama = teks.take(40)) }
    }

    fun ubahLokasi(teks: String) {
        _uiState.update { it.copy(lokasi = teks) }
    }

    fun ubahTautan(teks: String) {
        _uiState.update { it.copy(tautanGrup = teks) }
    }

    fun ubahMatakuliah(matakuliah: Matakuliah) {
        _uiState.update { it.copy(matakuliah = matakuliah) }
    }

    fun kirim() {
        if (!_uiState.value.bisaSimpan) return

        viewModelScope.launch {
            _uiState.update { it.copy(sedangMengirim = true) }
            delay(800)

            PenyimpananKelompok.tambah(
                nama = _uiState.value.nama,
                lokasi = _uiState.value.lokasi,
                tautanGrup = _uiState.value.tautanGrup,
                matakuliah = _uiState.value.matakuliah
            )

            _uiState.value = FormKelompokUiState(pesan = "Kelompok berhasil ditambahkan")
        }
    }
}