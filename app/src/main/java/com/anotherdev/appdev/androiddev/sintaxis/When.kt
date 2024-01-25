package com.anotherdev.appdev.androiddev.sintaxis

fun main() {
    getSemestre(12)
}

fun result(value: Any) {
    // aqui hacer que entre cualquier cosa como variable de entrada
    when (value) {
        is Int -> value + value
        is String -> println("Has escogido un string y es: $value")
        is Boolean -> if (value) println("Hola has escogido un boolean y es true")
    }
}

fun getSemestre(month: Int): String {
    //aqui se aplica el concepto de rangos
    return when (month) {
        in 1..6 -> return ("primer semestre")
        in 7..12 -> return ("segundo semestre")
        !in 1..12 -> return ("Semestre no valido")
        else -> "Hola"
    }

}

fun getTrimestre(month: Int) {
    when (month) {
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer Trimestre")
        10, 11, 12 -> println("cuarto trimestre")
        else -> println("trimestre no valido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        // puedes tambien enviar meses como un array
        0 -> {
            println("mes makia-1")
            println("mes makia-2")
            println("mes makia-3")
        }

        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("No es un mes valido")
    }
}