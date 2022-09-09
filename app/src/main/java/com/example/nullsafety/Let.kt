package com.example.nullsafety

// sintaxe diferentes (facilidade maior)
fun main() {
    val str: String? = null

    if (str != null) {
        str.lowercase()
        str.length
    }

    str?.let {
        it.lowercase()
        it.length
    }
}