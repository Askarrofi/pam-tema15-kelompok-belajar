package com.app.kelompokbelajar

import android.os.Build

actual fun namaPlatform(): String =
    "Android ${Build.VERSION.SDK_INT}"