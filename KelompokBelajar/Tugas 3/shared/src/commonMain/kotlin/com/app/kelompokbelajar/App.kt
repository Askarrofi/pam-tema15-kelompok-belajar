package com.app.kelompokbelajar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import com.app.kelompokbelajar.Data.daftarKelompokContoh
import com.app.kelompokbelajar.ui.LayarUtama

import org.jetbrains.compose.resources.painterResource

import kelompokbelajar.shared.generated.resources.Res
import kelompokbelajar.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val sapa = remember { sapaan() }
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
        }
    }
}