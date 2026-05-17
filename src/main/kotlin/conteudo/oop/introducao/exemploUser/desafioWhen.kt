package conteudo.oop.introducao.exemploUser

fun main() {

    print("Escolha um dia da semana: ")
    val diadasemana = readln()

    when (diadasemana) {
        "sab", "dom" -> {
            println("final de semana")
        }
        "seg", "ter", "qua", "qui", "sex" ->{
            println("dia da semana")
        }
        else -> {
            println("dia inválido")
        }
    }
}