// - Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
//     1. Sumar
//     2. Restar
//     3. Multiplicar
//     4. Dividir 
//     5. Finalizar
//     Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4

fun main(){
    var opcion: Int
    var n1: Float
    var n2: Float

    do{
        println("ingrese el primer numero")
        n1= readLine()!!.toFloat()
        println("ingrese el segundo numero")
        n2 = readLine()!!.toFloat()
        println("elija una de las siguients opciones: \n1.suma \n2.resta\n3.multiplicar \n4.dividir \n5.finalizar\n")
        opcion=readLine()!!.toInt()
        when(opcion){
        1 -> println("el resultado de la suma es: ${n1+n2}")
        2 -> println("el resultado de la resta es: ${n1-n2}")
        3 -> println("el resultado de la multiplicación es: ${n1*n2}")
      4-> {
        if(n2<=0){
            println("el segundo numero no puede ser negativo ni 0")
        }else{
            println("el resultado de la division es : ${n1/n2}")

        }
      }

        5-> println("finalizar programa")
        else-> println("opcion invalida")
    }
    }while(opcion!=5)
 
}