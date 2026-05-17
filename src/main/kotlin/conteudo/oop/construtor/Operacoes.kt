package conteudo.oop.construtor

class Operacoes (var x: Double, var y: Double){

    fun somar():Double {
        return x + y
    }

    fun multiplicar():Double {
        return x * y
    }

    fun subtrair():Double {
        return x - y
    }

    fun dividir(): Double { //nem sempre a divisão retornará um valor, por isso poderá não ter o tipo de retorno, no caso Double
        return if (y == 0.0) {
            println("Divisão por zero não é permitida.")
            Double.NaN // Retorna NaN para indicar erro na divisão
        } else {
            x / y
        }
    }
}