package com.example.navigasidasar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform