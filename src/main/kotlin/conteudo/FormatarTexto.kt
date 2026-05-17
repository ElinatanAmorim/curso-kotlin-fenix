package conteudo

import java.time.LocalDate

fun main(){

//Formatação de Texto
    val welcome = """
        Olá, Elinatan, 
        seu produto chegou!
    """.trimIndent() //isso retira os espaços extras nas extremidades
    println(welcome)

    val csv1 ="""
    texto1
    texto2
    texto3
    """.replaceIndent(",") //acrescentou o delimitador ','
    println(csv1)

    print("\n")

    val csv2 ="""
    texto1
    texto2
    texto3
    """.trimIndent()
    println(csv2)

    print("\n")
    val csvComDelimitador = csv2.replace("\n", ", ") // Substitui quebras de linha por delimitador ", "
    println(csvComDelimitador)

    val name = "Elinatan"
    val age = 34
    val height = 1.72
    println("Olá $name Você tem $age anos. E sua altura é $height" +
    "e seu nome tem ${name.length} caracteres")


    /*Teste - Crie um programa que possa imprimir a quantidade de caracteres do seu nome e também qual será a sua idade no ano 2050.
Exemplo de mensagem: Olá Tiago. Em 2050 você terá 60 anos. Seu nome possui 5 caracteres.
     */
    val dataFinal = 2050
    val dataInicial = 1990
    val anoAtual = LocalDate.now().year
    val ageCalculada = anoAtual - dataInicial
    val idadeFutura = (dataFinal - anoAtual) + age
    val tamanhoNome = name.length

    val produto1 = "notebook"
    val produto2 = "notebook"
    println(produto1 == produto2)
}
