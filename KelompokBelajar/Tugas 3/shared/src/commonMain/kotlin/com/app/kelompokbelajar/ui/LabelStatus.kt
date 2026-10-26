package com.app.kelompokbelajar.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.kelompokbelajar.model.Status

@Composable
fun LabelStatus(status: Status) {
    val (teks, warna) = when (status) {
        Status.Dibuka -> "Dibuka" to Color(0xFFBBDEFB)
        is Status.Berjalan -> "Berjalan" to Color(0xFFFFE082)
        is Status.Selesai -> "Selesai" to Color(0xFFA5D6A7)
    }

    Text(
        text = teks,
        fontSize = 12.sp,
        modifier = Modifier
            .background(warna, RoundedCornerShape(50))
            .padding(horizontal = 12.dp, vertical = 4.dp)
    )
}