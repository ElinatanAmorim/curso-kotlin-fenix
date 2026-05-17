package conteudo

fun main() {

//    while: Verifica a condição antes de executar o bloco.
//    do-while: Executa o bloco pelo menos uma vez, depois verifica a condição.

    var i = 0
    while (i < 3) {
        println(i)
        i++
    }

    println("insira a qtd de repetição")

    val limite = readln().toInt()
    i = 0 // Reinicia o valor de i para 0, caso queira que comece de novo

    while (i < limite) {
        println(i)
        i++
    }
    println("Fim do programa!")

    //Crie um programa capaz de sempre dobrar um número, começando em 2 e mostre ao usuário imprimindo no console.
    //Regra: O limite de interações é 10.
    //A saida deve ser:
    //2, 4, 8 ... 1024

    i = 2
    val limiteExercicio = 10
    var contador = 0

    while (contador < limiteExercicio) {
        println(i)
        i *= 2
        contador++
    }
    println("Fim do programa!")

    //for : Quando se sabe o nº exato de iterações ou quando se deseja iterar sobre uma coleção
    //      (lista, array, intervalo de números, etc.).

    for (i in 0..limiteExercicio) { //until posso substituir pelo ..
        println(i)
    }
    println("Fim do programa!")
}