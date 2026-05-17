package conteudo.funcoes

fun main() {
    financiamento("Thiago", 43854874525, 50.000, true)
    financiamento("Eduardo", 45785236984, 30.000, false)
    financiamento("Beatriz", 47936954870, 60.000, false)
}

fun financiamento(nome:String, cpf: Long, credito: Double, aprovado: Boolean) {
    val textoAprovado = if (aprovado) "Aprovado" else "Negado"
    //val creditoFormatado = "%,.3f".format(credito)
    println("Senhor(a) $nome, portador do CPF $cpf, gostariamos de informá-lo que seu pedido de crédito no valor de " +
            "$credito foi $textoAprovado")
}