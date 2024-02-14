import kotlin.math.*

class Ejercicio {

}

fun main() {
    println("Ingrese un primer numero")
    var n1:Int = readln()!!.toInt()

    println("Ingrese un segundo numero")
    var n2:Int = readln()!!.toInt()

    println("Ingrese una operacion: add substract times divide")

    var oper:String=readln()!!.toString().lowercase()

    when(oper){
        "add" -> println(n1 + n2)
        "substract" -> println(n1 - n2)
        "times" -> print(n1*n2)
        "divide" -> println(n1/n2)
        "power" -> println(n1.toDouble().pow(n2))
        "root" -> println(sqrt(n2.toDouble()))
        else  -> println("Operacion equivocada")
    }

}