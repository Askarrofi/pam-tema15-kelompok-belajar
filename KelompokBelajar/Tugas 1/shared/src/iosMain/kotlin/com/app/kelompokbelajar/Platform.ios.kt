package com.app.kelompokbelajar

import platform.UIKit.UIDevice

actual fun namaPlatform(): String =
    UIDevice.currentDevice.systemName()