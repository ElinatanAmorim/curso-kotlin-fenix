package conteudo.funcoes.exercicioConversorDeMedidas

fun main() {

    /*Requisitos:
    O programa deve apresentar uma espécie de "menu de escolhas" por número, as opções devem incluir:
         - 1 Celsius para Fahrenheit
         - 2 Fahrenheit para Celsius
         - 3 Quilômetros para Milhas
         - 4 Milhas para Quilômetros

    O programa deve exibir o resultado da conversão com uma mensagem clara. Por exemplo
    */

    val conversoes = Conversoes()
    print("Digite um valor: ")
    val valor = readln().toDouble()

    println(""" Selecione uma opção do Menu a seguir: 
        |1 Celsius para Fahrenheit
        |2 Fahrenheit para Celsius
        |3 Quilômetros para Milhas
        |4 Milhas para Quilômetros
    """.trimMargin())
    val opcao = readln()

    val resultado = when (opcao) {
        "1 Celsius para Fahrenheit" -> conversoes.CelsiusParaFahrenheit(valor)
        "2 Fahrenheit para Celsius" -> conversoes.FahrenheitParaCelsius(valor)
        "3 Quilômetros para Milhas" -> conversoes.KMParaMilhas(valor)
        "4 Milhas para Quilômetros" -> conversoes.MilhasParaKM(valor)
        else -> {
            println("Opção inválida.")
            return
        }
    }

    println("O resultado da conversão é: $resultado")
}