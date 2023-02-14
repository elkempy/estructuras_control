// Haga un algoritmo que solicite el numero de horas trabajadas de un empleado, teniendo que el valor de la hora es igual a $2000 calcule el salario base y realicele un descuento del 10% por concepto de derechos medicos, posteriormente solicite el tipo de empleado y realice el aumento del salario basado en la siguiente tabla: 
// Tipo A - Aumento del 30%
// Tipo B - Aumento del 20%
// Tipo C - Aumento del 10%
//  En caso de que el usuario no tenga un tipo definido, entonces no se le realizará ningún aumento, indique cual seria el salario final basado en los calculos anteriores.

fun main(){
    var horasTrabajadas: Int= 0
    val valorhora: Int= 2000
    var porcentaje: Double= 0.1
    var aumento: Double= 0.0
    var descuento: Double= 0.0
    var salarioFinal: Double= 0.0

    println("ingrese las horas trabajadas:")
    horasTrabajadas= readLine()!!.toInt()
    
    var salario= horasTrabajadas*valorhora
    println("su salario es: $salario")

    descuento=salario*porcentaje
    println("se reaizara un descuento del 10% de $descuento")
    salarioFinal=salario-(descuento)
    println("su salarioFinal es: $salarioFinal")

    println("ingrese su categoria o tipo de empleado: (a,b,c)")
    var categoriaEmpleado = readLine()

    when(categoriaEmpleado){
        "a"->{aumento = 0.3
    }
        "b"->{aumento = 0.2
    }
         "c"->{aumento = 0.1
    }

        else->{println("no tiene derecho a aumento")
        aumento=0.0
        }
    }
    if(aumento!=0.0){
        aumento=salarioFinal*(aumento)
        salarioFinal=salarioFinal+aumento
        println("se le realizo un aumento de $aumento")
        println("salarioFinal es: $salarioFinal")
    }
}