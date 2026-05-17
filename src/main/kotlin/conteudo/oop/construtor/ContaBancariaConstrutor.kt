package conteudo.oop.construtor

class ContaBancariaConstrutor(
    var saldo: Double = 0.0, var titular: String = "", var deposito: Double = 0.0,
    var saque: Double = 0.0
) {


    fun depositar(valor: Double) {
        saldo += valor   //+= é uma forma abreviada de escrever saldo = saldo + valor.
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente para saque!")
        }
    }

    fun consultarSaldo(): Double {
        return deposito - saque
    }
}

//saldo: um valor do tipo Double que representa o saldo da conta.
//titular: o nome do titular da conta.
//
//Comportamentos:
//depositar(valor: Double): adiciona o valor passado ao saldo da conta.
//sacar(valor: Double): subtrai o valor passado do saldo.
//buscarSaldo(): retorne o saldo atual da conta.
//Regras: