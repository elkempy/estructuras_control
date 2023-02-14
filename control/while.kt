// Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron

fun main(){
    var confirmacion = "si"
    var contador= 0

    while (confirmacion == "si"){
        println("ingrese su nombre")
        val nombre= readLine()!!
        println("hola $nombre")
        contador++
        println("desea ingresar mas personas?")
        confirmacion = readLine()!!

    }

    println("llegaron $contador personas")


}