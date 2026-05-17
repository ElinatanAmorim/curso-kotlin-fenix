package conteudo.funcoes

fun main() {

    val operacoes = Operacoes()

    print("Digite sua idade: ")
    val idade = readln().toInt()
    verificacaoIdade(idade)

    var continuar: Boolean

    //Resposta do Excercicio
    do {
    print("Digite o valor de x: ")
    val x = readln().toDouble()
    print("Digite o valor de y: ")
    val y = readln().toDouble()
    println(""" Digite o valor da operação:
        +
        -
        *
        /
    """.trimMargin()) //remove espaços em branco no início das linhas.
    val operacao = readln()

    when(operacao){
        "+" -> operacoes.adicao(x,y)
        "*" -> operacoes.multiplicacao(x,y)
        "-" -> operacoes.subtracao(x,y)
        "/" -> operacoes.divisao(x,y)
        else -> println("Operação invalida")
    }

        var opcao: String
        do {
            print("Deseja realizar outra operação? (S/N): ")
            opcao = readln().uppercase()

            if (opcao != "S" && opcao != "N") {
                println("Opção inválida! Por favor, digite 'S' para continuar ou 'N' para sair.")
            }
        } while (opcao != "S" && opcao != "N")  // Garante entrada válida

        continuar = opcao == "S"

    } while (continuar)

    println("Obrigado!")
}

fun verificacaoIdade(age: Int) {
    if (age >= 18) {
        println("Pode dirigir")
    } else {
        println("Não pode dirigir")
    }
}

//Crie um programa que represente uma pequena "calculadora" que permita aos usuários realizar operações básicas como adição, subtração, multiplicação e divisão.
//Use o fundamento de funções para cada operação.
//DICA: Valide a condição de divisão por zero para não dar erro no programa
//A saída deve ser algo como:
//Adição: 10 + 5 = 15
//Subtração: 10 - 5 = 5
//Multiplicação: 10 * 5 = 50
//Divisão: 10 / 5 = 2