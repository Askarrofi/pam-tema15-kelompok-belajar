package com.app.kelompokbelajar.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.kelompokbelajar.model.KelompokBelajar
import com.app.kelompokbelajar.model.Status

@Composable
fun LayarUtama(semua: List<KelompokBelajar>) {
    val terbaru = semua.sortedByDescending { it.id }
    val jumlahAktif = semua.count { it.status !is Status.Selesai }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Text("+", fontSize = 24.sp)
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(
                text = "Kelompok Belajar",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)
            )
            Text(
                text = "$jumlahAktif kelompok aktif",
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            DaftarKelompok(semua = terbaru)
        }
    }
}