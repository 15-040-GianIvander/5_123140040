package com.example.bottomnavigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform