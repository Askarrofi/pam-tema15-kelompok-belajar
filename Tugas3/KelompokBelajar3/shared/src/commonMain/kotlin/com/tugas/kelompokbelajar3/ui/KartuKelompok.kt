package com.tugas.kelompokbelajar3.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tugas.kelompokbelajar3.model.KelompokBelajar
import com.tugas.kelompokbelajar3.model.label

@Composable
fun KartuKelompok(
    kelompok: KelompokBelajar,
    onKlik: () -> Unit = {}
) {
    val tautan = LocalUriHandler.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onKlik() },
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = kelompok.nama,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(text = kelompok.mataKuliah.nama, color = Color.Gray)
                Text(text = "Lokasi: ${kelompok.lokasi}", color = Color.Gray)

                if (!kelompok.tautanGrup.isNullOrEmpty()) {
                    Row {
                        Text(
                            text = "Link Tautan: ",
                            color = Color.Gray
                        )
                        Text(
                            text = "Klik Disini",
                            color = Color.Blue,
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier.clickable {
                                val urlAsli = kelompok.tautanGrup
                                val url = if (!urlAsli.startsWith("http://") &&
                                    !urlAsli.startsWith("https://")) {
                                    "http://$urlAsli"
                                } else {
                                    urlAsli
                                }

                                try {
                                    tautan.openUri(url)
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }
                        )
                    }
                } else {
                    Text(text = "Link Tautan: Tidak tersedia", color = Color.Gray)
                }

                Text(text = kelompok.status.label(), color = Color.Gray, fontSize = 12.sp)
            }

            Spacer(modifier = Modifier.width(8.dp))

            LabelStatus(kelompok.status)
        }
    }
}