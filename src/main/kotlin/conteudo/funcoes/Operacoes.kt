package conteudo.funcoes

class Operacoes {

    fun adicao(x: Double, y: Double) {
        var resultado = x + y
        println("O resultado da soma é $resultado")
    }

    fun subtracao(x: Double, y: Double) {
        var resultado = x - y
        println("O resultado da subtração é $resultado")
    }

    fun multiplicacao(x: Double, y: Double) {
        var resultado = x * y
        println("O resultado da subtração é $resultado")
    }

    fun divisao(x: Double, y: Double) {
        if (y == 0.0) {
            println("Divisão por zero não é permitida.")
        }
        var resultado = x / y
        println("O resultado da divisão é $resultado")
    }

}