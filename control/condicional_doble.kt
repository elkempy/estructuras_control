// La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras mayores o iguales a los $ 100.000 y un descuento del 10% en compras normales. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

fun main(){
    println( " ingrese el valor de su compra")
    var valorCompra = readLine()!!.toDouble()

    println("valor de la compra es : $valorCompra")

    var descuento = 0.0

    if (valorCompra >= 100000){
        descuento = valorCompra *0.5
        valorCompra -= descuento
        println("se aplico un descuento del 50% de : $descuento")
    } else{
        descuento = valorCompra * 0.1
        valorCompra-= descuento
        println( " se aplico un descuento del 10% de : $descuento")
    }

    println("valor total de la compra es : $valorCompra")
}