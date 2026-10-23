package com.tugas.kelompokbelajar3

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tugas.kelompokbelajar3.data.daftarKelompokContoh
import com.tugas.kelompokbelajar3.ui.LayarUtama

@Composable
@Preview
fun App() {
    MaterialTheme {
        LayarUtama(daftarKelompokContoh)
    }
}