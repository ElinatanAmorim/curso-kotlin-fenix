package conteudo.oop.construtor

fun main() {

    val calculo = Operacoes(x= 10.0, y=2.0)

    println(calculo.somar())

    println("""
        Adição.......: ${calculo.somar()}
        Subtração....: ${calculo.subtrair()}
        Multiplicação: ${calculo.multiplicar()}
        Divisão......: ${calculo.dividir()}
    """.trimIndent())
}
