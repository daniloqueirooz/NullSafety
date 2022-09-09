package com.example.nullsafety

fun main() {
/*
QUE TENTA PREVINIR QUE ERROS ACONTECAM NAS VARIAVEIS QUE SÃO NULAS
? (Tratar caso haja algum problema)
NullPointerException
!! Vamos assumir o erro (Qualquer problema)
*/


    try {
        val s: String? = null
        println(s!!.length)

        val a = 10 / 10
    } catch (e: NullPointerException) {
        println("Váriavel nula!")

    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } finally {
        println("Finally!")

    }
    println("Fim!")
}

