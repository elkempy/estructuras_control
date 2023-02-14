// Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
//  1. Cantidad de estudiantes procesados
//  2. Promedio total de los promedio

fun main(){
    var cantidadEstudiantes: Int
    var promTotal= 0.0

    println("ingrese la cantidad de estudiantes: ")
    cantidadEstudiantes=readLine()!!.toInt()

for (i in 1..cantidadEstudiantes){
 println("ingrese el promedio del estudiante: $i ")
 var promedio=readLine()!!.toInt()
promTotal+= promedio}
var promFinal=promTotal/cantidadEstudiantes
println("la cantidad de estudiantes fue de $cantidadEstudiantes")
println("el promedio de todos los promedios fue de $promFinal")

}