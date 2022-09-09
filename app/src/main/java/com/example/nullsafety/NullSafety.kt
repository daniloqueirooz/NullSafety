package com.example.nullsafety

fun main() {
/*
QUE TENTA PREVINIR QUE ERROS ACONTECAM NAS VARIAVEIS QUE SÃO NULAS
? (Tratar caso haja algum problema)
NullPointerException
!! Vamos assumir o erro (Qualquer problema)
*/


    try {
        var s: String? = null
        println(s?.length)
    } catch (e: NullPointerException) {
        println("Váriavel nula!")

    } catch (e: ArithmeticException) {
        println("Impossível esse número ser dividido")
    } finally {

    }
}

