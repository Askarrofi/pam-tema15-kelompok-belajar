package com.app.kelompokbelajar.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.kelompokbelajar.data.DataMatakuliah

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormKelompokScreen(
    vm: FormKelompokViewModel = viewModel { FormKelompokViewModel() }
) {
    val state by vm.uiState.collectAsState()

    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Form Kelompok Baru")

        KolomTeks(label = "Nama Kelompok", value = state.nama, onValueChange = vm::ubahNama)
        KolomTeks(label = "Lokasi", value = state.lokasi, onValueChange = vm::ubahLokasi)
        KolomTeks(label = "Tautan Grup", value = state.tautanGrup, onValueChange = vm::ubahTautan)

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = it }
        ) {
            OutlinedTextField(
                value = state.matakuliah.nama,
                onValueChange = {},
                readOnly = true,
                label = { Text("Pilih Mata Kuliah") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DataMatakuliah.daftar.forEach { mk ->
                    DropdownMenuItem(
                        text = { Text(mk.nama) },
                        onClick = {
                            vm.ubahMatakuliah(mk)
                            expanded = false
                        }
                    )
                }
            }
        }

        Button(
            onClick = vm::kirim,
            enabled = state.bisaSimpan,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(if (state.sedangMengirim) "Menyimpan..." else "Simpan")
        }

        state.pesan?.let { Text(it) }
    }
}