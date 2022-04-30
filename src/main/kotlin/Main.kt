fun somar(numero1: Double, numero2: Double): Double{
    val total = numero1 + numero2
    println("a soma é: $total")
    return total
}

fun subtrair(numero1:Double, numero2:Double): Double{
    val total = numero1 - numero2
    println("a subtração é: $total")
    return total

}

fun multiplicar (numero1: Double, numero2: Double): Double{
    val total = numero1 * numero2
    println("a multiplicação é: $total")
    return total
}

fun dividir(numero1: Double, numero2: Double): Double{
    var total: Double = 0.0
    try {
//        println("LINHA 19 - total antes: $total")
        total = numero1/numero2
//        println("LINHA 21 - total depois: $total")
    } catch (e: ArithmeticException){
        println("Não pode dividir número por zero.")
    }
    println("a divisão é: $total")
    return total
}

fun main() {
    val valorQueRepete = 13
    val n1 = 2.0
    val n2 = 5.0

    somar(n1, n2)
//    println("variável teste")
//    val teste = somar(n1, n2)
//    println(somar(10.0, 2.0))
    subtrair(n1, n2)
    multiplicar(n1, n2)
    dividir(n1, n2)

//
//    println("valor que repete é: $valorQueRepete")
//    val resultado3 = somar(numero1, numero2)
//    println(resultado3 + valorQueRepete)
//    val resultado = subtrair(numero1, numero2)
//    println(resultado + valorQueRepete)
//    val resultado1 = multiplicar(numero1, numero2)
//    println(resultado1 + valorQueRepete)
//    val resultado2 = dividir(numero1, numero2)
//    println(resultado2 + valorQueRepete)
//    println(resultado2)


}