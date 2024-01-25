package com.anotherdev.appdev.androiddev.sintaxis


fun main() {
    ifBasic()
    ifAnidado()
    ifboolean()
    ifInt()
    ifMultipleOr()
}

fun ifMultipleOr() {
    var pet = "gato"
    var imHappy = true
    // aqui se aplican las condiciones multiuples usando un "or"
    if ((pet == "dog" && imHappy) || (pet == "gato" && imHappy)) {
        println("Escogiste $pet")
        println("Es un gato o un perro y esta feliz")
    }
}

fun ifMultiple() {
    var age = 18
    // aqui se aplican las condiciones multiuples usando un "and "
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puedo beber cerveza")
    } else {
        "No estas permitido para beber"
    }
}

fun ifInt() {
    var age = 18

    if (age >= 18) {
        println("Puede beber cerveza")
    } else {
        println("Eres menos puedes beber jugo")
    }
}

fun ifboolean() {
    var soyFeliz: Boolean = false
// se puede usar el operador "!" para hacer referencia a lo contrario (Solo aplica para los booleanos)
    if (!soyFeliz) {
        println("Toy triste :( ")
    }
}

fun ifBasic() {
    val name = "Luis"
    if (name == "Andres") {
        println("Oye, la variable name es $name")
    } else {
        println("este no es $name")
    }
}

fun ifAnidado() {
    val animales = "gato"

    if (animales == "gato") {
        println("Oye, la variable name es gato")
    } else if (animales == "perro") {
        println("Oye, la variable name es perro")
    } else if (animales == "pajaro") {
        println("Oye, la variable name es pajaro")
    } else {
        println("este no es un animal")
    }
}