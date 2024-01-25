package com.anotherdev.appdev.androiddev.sintaxis

fun main(){
    mutablelist()
}

fun mutablelist(){
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
//    println(weekDays)
//    weekDays.add(3,"LuisDay")
//    println(weekDays)

    if(weekDays.isEmpty()){
//        no voy a pintar nada
    }else{
        weekDays.forEach{ weeks -> println(weeks) }
    }
    if(weekDays.isNotEmpty()){

        weekDays.forEach{ weeks -> println("si hay dias de la semana") }
    }
    weekDays.last()

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly[0])
//    println(readOnly.last())
//    println(readOnly.first())

    var example = readOnly.filter {weekDay -> weekDay.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }

}