package com.app.kelompokbelajar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

import com.app.kelompokbelajar.data.PenyimpananKelompok
import com.app.kelompokbelajar.ui.FormKelompokScreen
import com.app.kelompokbelajar.ui.LayarUtama

@Composable
@Preview
fun App() {
    MaterialTheme {
        var diForm by remember { mutableStateOf(false) }

        val daftar by PenyimpananKelompok.daftar.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Tema: 15. Kelompok Belajar",
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                )
                Text("Nama Anggota:")
                Text("R. Askarrofi Prabularizda Anggoro (124140070)")
                Text("Jalaludin Mufadhol Al Faruq (124140164)")
                Text("Mahavira Athaya Fikri (124140050)")

                Button(
                    onClick = { diForm = !diForm },
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(if (diForm) "Lihat Daftar Kelompok" else "+ Tambah Kelompok Baru")
                }
            }

            if (diForm) {
                FormKelompokScreen()
            } else {
                LayarUtama(semua = daftar)
            }
        }
    }
}