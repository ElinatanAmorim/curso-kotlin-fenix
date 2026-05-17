package conteudo

fun main() {

    var name = "Matteo"
    val tamanhoNome = name.length
    val nameA = name.uppercase() //tudo maiúscula
    val namea = name.lowercase() //tudo minúscula
    val nameCapitalized = namea.replaceFirstChar { it.uppercaseChar() } //inicial maiúscula
    // depois pega o primeiro caracter e a expressão lambad it.uppercase, o it é o caracter

    val nome = readln() //readln lê a entrada do usuário como uma String
    val desconto = 20.00
    println("Olá, $nome, voçê ganhou $desconto reais de desconto!")

    val descontoFormatado = "R$ %.2f".format(desconto)
    println("Olá, $name, você ganhou $descontoFormatado de desconto!")

    println(tamanhoNome)
    println("Olá".length)
    println(nameA)
    println(namea)
    println(nameCapitalized)

}