package conteudo.funcoes.exercicioCalculadoraSimples

fun main() {

    var calculo = CalculosSimples()
//    val a = 10.0
//    val b = 0.0
    println("Digite o valor de a: ")
    var a = readln().toDouble()

    println("Digite o valor de b: ")
    var b = readln().toDouble()

    println("o valor da soma é " + calculo.adicao(a, b))
    println("o valor da subtração é " + calculo.subtracao(a, b))
    println("o valor da multiplicação é " + calculo.multiplicacao(a, b))
    println(calculo.divisao(a, b))
}