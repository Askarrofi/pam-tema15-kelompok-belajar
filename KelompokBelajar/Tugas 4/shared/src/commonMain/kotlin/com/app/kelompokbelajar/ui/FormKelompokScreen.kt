package com.app.kelompokbelajar.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FormKelompokScreen(
    vm: FormKelompokViewModel = viewModel { FormKelompokViewModel() }
) {
    val state by vm.uiState.collectAsState()

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Form Kelompok Baru")

        KolomTeks(label = "Nama Kelompok", value = state.nama, onValueChange = vm::ubahNama)
        KolomTeks(label = "Lokasi", value = state.lokasi, onValueChange = vm::ubahLokasi)

        Button(onClick = vm::kirim, enabled = state.bisaSimpan) {
            Text(if (state.sedangMengirim) "Menyimpan..." else "Simpan")
        }

        state.pesan?.let { Text(it) }
    }
}