package conteudo.funcoes.exercicioCalculadoraSimples

class CalculosSimples {

    fun adicao(a: Double, b: Double):Double{
        return a + b
    }

    fun subtracao(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicacao(a: Double, b: Double): Double {
        return a * b
    }

    fun divisao(a: Double, b: Double): Double? {
        return if (b == 0.0) {
            print("Divisão por zero não é permitida ")
            return null
        } else {
            return a / b
        }
    }
}



//Crie um programa que represente uma pequena "calculadora" que permita aos usuários realizar operações básicas como adição, subtração, multiplicação e divisão.

//Use o fundamento de funções para cada operação.

//DICA: Valide a condição de divisão por zero para não dar erro no programa
//
//A saída deve ser algo como:
//
//Adição: 10 + 5 = 15
//Subtração: 10 - 5 = 5
//Multiplicação: 10 * 5 = 50
//Divisão: 10 / 5 = 2