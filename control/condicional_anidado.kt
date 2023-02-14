// De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea los datos de entrada e informe: 
// -Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el sueldo a pagar. 
// -Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%. 
// -Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.

fun main(){

    var sueldo: Double =0.0
    var antigüedad: Int=0
    var aumento: Double =0.0

println("ingrese su sueldo: ")
sueldo=readLine()!!. toDouble()
println("su sueldo es: $sueldo")

println("ingrese su antigüedad: ")
antigüedad=readLine()!!.toInt()
println("su antigüedad es: $antigüedad")


if(sueldo<500 && antigüedad>=10){
aumento=sueldo*0.2
sueldo+=aumento
println("ud tiene derecho a un amento del 20%, su sueldo con el aumento es de : $sueldo")

}else if (sueldo<500 && antigüedad<10){
    aumento=sueldo*0.05
    sueldo+=aumento
    println("ud tiene derecho a un del 5% aumento es de : $sueldo")
}else{
    println("usted no tiene derecho a un aumento : $sueldo")
}
}
