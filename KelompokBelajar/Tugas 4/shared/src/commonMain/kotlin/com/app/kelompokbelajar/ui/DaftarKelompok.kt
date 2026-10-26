package com.app.kelompokbelajar.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.app.kelompokbelajar.model.KelompokBelajar

@Composable
fun DaftarKelompok(
    semua: List<KelompokBelajar>,
    onPilih: (KelompokBelajar) -> Unit = {}
) {
    LazyColumn(
        contentPadding = PaddingValues(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 88.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(semua, key = { it.id }) { kelompok ->
            KartuKelompok(kelompok, onKlik = { onPilih(kelompok) })
        }
    }
}