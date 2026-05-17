package conteudo.funcoes

fun main() {

    wellcome()
    val resultado = somar() + 2
    println(resultado)

    val horario = Horario() // Cria uma instância da classe Horario
    horario.saudacao() // Chama o método saudacao na classe Horario

    //val resultadoMultiplicacao = multiplicar(x = 2, y = 5) poderia ter criado a viriável
    println("Resultado da Multilicação é: ${multiplicar(x = 2, y = 5)}")

}

//Desclarei a função welcome
fun wellcome() {
    "Olá"
}

fun somar(): Int { //retorna um inteiro
    return 2 + 3
}
fun multiplicar(x: Int , y: Int): Int {
    return x * y
}
