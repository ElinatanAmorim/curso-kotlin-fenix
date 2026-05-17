package conteudo.funcoes.exercicioClassificadorNotas

// Crie uma função chamada classificarNota que retorne uma mensagem
// com base na nota informada pelo usuário.
//
// REGRA: Dependendo da nota, a função deve retornar:
// "Excelente!" se for entre 9 e 10.
// "Aprovado!" se for entre 7 e 8.
// "Recuperação!" se for entre 5 e 6.
// "Reprovado!" se for abaixo de 5.
//
// IMPORTANTE: O programa deve verificar notas inválidas,
// ou seja, fora do intervalo 0-10. Informe ao usuário "Nota invalida".
// Também verifique se a entrada é realmente um número.
//
// A saída deve ser algo como: Aprovado! Continue assim.

fun main() {

    print("Digite a nota da prova: ")
    val notaParam = readLine()?.toIntOrNull()

    if (notaParam == null) {
        println("Valor inválido ou inexistente")
    } else {
        val regra = RegraNota() //instancia a Classe
        println(regra.nota(notaParam)) //chama o metodo passando a nota para aplicar
    }
}
// Forçando o processo a repetir até receber um valor válido
//fun main() {
//    var notaParam: Int? = null
//
//    while (notaParam == null || notaParam < 0 || notaParam > 10) {
//        print("Digite a nota da prova (0-10): ")
//        notaParam = readLine()?.toIntOrNull()
//
//        if (notaParam == null) {
//            println("Entrada invalida. Digite um numero inteiro.")
//        } else if (notaParam < 0 || notaParam > 10) {
//            println("Nota invalida. Digite um valor entre 0 e 10.")
//        }
//    }
//
//    val regra = regraNota()
//    println(regra.nota(notaParam))
//}
