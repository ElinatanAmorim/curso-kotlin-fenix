package conteudo.funcoes.exercicioClassificadorNotas

class RegraNota {

    fun nota(nota: Int): String{
        return when{
//            nota <0 || nota > 10 -> "Nota inválida"
            nota in 9..10 -> "Excelente"
            nota in 7..8 -> "Aprovado"
            nota in 5..6 -> "Recuperação"
            nota in 0..4 -> "Reprovado"
            else -> "Nota inválida"
        }
    }
}
// REGRA: Dependendo da nota, a função deve retornar:
    // "Excelente!" se for entre 9 e 10.
    // "Aprovado!" se for entre 7 e 8.
    // "Recuperação!" se for entre 5 e 6.
    // "Reprovado!" se for abaixo de 5.


