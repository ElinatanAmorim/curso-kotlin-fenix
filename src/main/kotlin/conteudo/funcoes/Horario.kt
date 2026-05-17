package conteudo.funcoes

import java.time.LocalTime
import java.time.format.DateTimeFormatter

class Horario {

    fun saudacao() {
        var horaAtual = LocalTime.now()
        val formato = DateTimeFormatter.ofPattern("HH:mm:ss") // Formato de 24 horas
        val horaFormatada = horaAtual.format(formato)

        val hora = horaFormatada.substring(0, 2) // Pegando os dois primeiros caracteres (apenas a hora)
        val horaInt = hora.toInt() //transformando a hora em Int
        println("Horário Atualizado: $horaFormatada")

        when (horaInt) {
            in 6..12 -> {
                println("Bom dia!")
            }
            in 13..18 -> {
                println("Boa tarde!")
            }
            in 19..23 -> {
                println("Boa noite!")
            }
            in 0..5 -> {
                println("Boa madrugada!")
            }
            else -> {
                println("Valor inválido")
            }
        }
    }
}
