package conteudo.funcoes


fun main() {
    println("iniciando o programa...")
    processarDados()
    println("fim do programa")

}

fun processarDados() {

    var passo = 1
    fun log() {
        println("PASSO $passo: executado!")
        passo = passo + 1
    }

    fazerLogin()
    log()

    buscarRelatorio()
    log()

    atualizarRelatorio()
    log()

    enviarParaEmail()
    log()

    agendarProximaData()
    log()
}

fun fazerLogin() {}

fun buscarRelatorio() {}

fun atualizarRelatorio() {}

fun enviarParaEmail() {}

fun agendarProximaData() {}