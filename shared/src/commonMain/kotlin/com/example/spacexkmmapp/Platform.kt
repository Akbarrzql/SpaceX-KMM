package com.example.spacexkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform