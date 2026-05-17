package conteudo.funcoes.exercicioSaudacao

//Crie uma função chamada saudacao que retorne uma mensagem de saudação com base na hora informada pelo usuário.
//
//REGRA: Dependendo da hora do dia, a função deve retornar:
//"Bom dia!" se for entre 6h e 12h.
//"Boa tarde!" se for entre 12h e 18h.
//"Boa noite!" se for entre 18h e 0h.
//"Boa madrugada!" se for entre 0h e 6h.
//
//IMPORTANTE: O programa deve verificar horários inválidos, ou seja, que estão fora do intervalo 0-23h. Informe ao usuário Horario invalido
//
//A saida deve ser algo como: Boa madrugada! Madruguinha.

fun main() {

    print("Digite a hora (0-23): ")
    val hora = readLine()?.toIntOrNull()

    if (hora == null) {
        println("Entrada inválida. Digite um número inteiro.")
    } else {
        println(saudacao(hora))
    }
}

fun saudacao(hora: Int): String {
    return when {
        hora < 0 || hora > 23 -> "Horário inválido"
        hora in 6..11 -> "Bom dia! Animado com o sol?"
        hora in 12..17 -> "Boa tarde! Cafézinho?"
        hora in 18..23 -> "Boa noite! Descansando?"
        else -> "Boa madrugada! Madruguinha."
    }
}



