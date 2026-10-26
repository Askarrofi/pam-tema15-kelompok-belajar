package com.app.kelompokbelajar.data

import kotlinx.coroutines.flow.Flow

interface Sumber<T> {
    suspend fun ambil(id: Int): T
    fun pantau(id: Int): Flow<T>
}