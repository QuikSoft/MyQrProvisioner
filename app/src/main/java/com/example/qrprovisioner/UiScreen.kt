package com.example.qrprovisioner
import android.graphics.Bitmap

sealed class UiScreen {
    object Form : UiScreen()
    data class QrPreview(val bitmap: Bitmap) : UiScreen()
}
