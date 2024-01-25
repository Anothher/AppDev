package com.anotherdev.appdev.sintaxis
fun main(){
    //indice = 0-7
    //tamaño = 8
    val weekDay = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    if (weekDay.size >= 8){
        println(weekDay[7])
    }else {
        println("No hay mas valores en el array")
    }
    for(position in weekDay.indices){
        println(weekDay[position])
    }
    for((position, value) in weekDay.withIndex()){
        println("la posicion $position, contiene $value")
    }
    for (diasSemana in weekDay)
        println(diasSemana)
}

