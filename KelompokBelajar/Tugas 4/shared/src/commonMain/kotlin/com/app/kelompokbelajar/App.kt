package com.app.kelompokbelajar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.app.kelompokbelajar.data.daftarKelompokContoh
import com.app.kelompokbelajar.data.PenyimpananKelompok
import com.app.kelompokbelajar.ui.FormKelompokScreen
import com.app.kelompokbelajar.ui.LayarUtama

@Composable
@Preview
fun App() {
    MaterialTheme {
        val sapa = remember { sapaan() }
        var diForm by remember { mutableStateOf(false) }
        val daftar by PenyimpananKelompok.daftar.collectAsState()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surfaceVariant),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Text("Tema: 15. Kelompok Belajar")
            Text("Nama Anggota:")
            Text("R. Askarrofi Prabularizda Anggoro (124140070)")
            Text("Jalaludin Mufadhol Al Faruq (124140154)")
            Text("Mahawira Athaya Fikri (124140050)")
            Text(sapa)
            LayarUtama(daftarKelompokContoh)

            Button(
                onClick = { diForm = !diForm },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(if (diForm) "Lihat Daftar" else "Tambah Kelompok Baru")
                }
            }

            if (diForm) {
                FormKelompokScreen()
            } else {
                LayarUtama(semua = daftar)
            }
    }
}
