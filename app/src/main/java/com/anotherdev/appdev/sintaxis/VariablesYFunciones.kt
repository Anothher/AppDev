package com.anotherdev.appdev.sintaxis

//APRENDIENDO VARIABLES EN KOTLIN
//  VARIABLES GLOBALES FUERA DE UNA FUNCION

val numero1: Int = 20
val numero2: Int = 30
val numFloat: Float = 20.2f

fun main() {
//    llamando a las funciones dentro de el archivo kt
//    funcionAritmetica()
//    funcionBoleana()
//    funcionFloat()
//    funcionString()
//    funcionNumerica()
    showMyName("Luis andres sepulveda santamaria")
    showMyAge()
    add(24, 23)
    val mySubtract = subtract(10,5)
    print("El resultado de la resta es: $mySubtract")
}

fun showMyName(name: String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int = 20) {
    // puedo mandar valores por defecto igualando la variable de entrada
    println("Tengo $currentAge años")
}

fun add(firtNumber: Int, secondNumber: Int) {
    println(firtNumber + secondNumber)
}
fun subtract(firtNumber: Int, secondNumber: Int):Int {
    return firtNumber - secondNumber

}
//tambien puedes achicar el codigo cuando una funcion es pequeña quitando los parentesis e igualandola
fun subtractCool(firtNumber: Int, secondNumber: Int) = firtNumber - secondNumber

fun funcionString() {
    //    tipo de variable string muy parecido a typescript
    val name: String = "Another"
//    tipo de variable entrero

}

fun funcionFloat() {
    //    tipo de variable float


//    print("Hola $numFloat")
    val double: Double = 20.820938

}

fun funcionBoleana() {
    //variable alfanumericas
    //char es solo un caracter
    val charExample1: Char = 'e'
    val charExample2: Char = '@'
    val charExample3: Char = '1'
    //string
    val stringExample = "Texto en String"
    //boleans variables
    val booleanExample: Boolean = true
    val booleanExample2 = false

}

fun funcionNumerica() {
    //val y var, val es una constante y val puede ser cualquier valor porque es una varibale
    var numerosPro: Int = 12
    numerosPro = 30
}

fun funcionAritmetica() {
    //    funciones aritmeticas
    println("Sumar")
    println("primer numero: $numero1")
    println("segundo numero: $numero2")
    println("Total de la suma:")
    var example: Int = numero1 + numFloat.toInt()
    println(example)
}