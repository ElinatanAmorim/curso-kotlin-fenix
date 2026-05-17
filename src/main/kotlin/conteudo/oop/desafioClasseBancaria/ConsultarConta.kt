package conteudo.oop.desafioClasseBancaria

import java.text.NumberFormat
import java.util.*

fun main() {

    val contabancaria = ContaBancaria()

    contabancaria.saldo = 0.0
    contabancaria.titular = "Natan"
    contabancaria.deposito = 1200.0
    contabancaria.saque = 500.0

    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    val consultarSaldoFormatado = formatoMoeda.format(contabancaria.consultarSaldo())

    println("O valor do saldo da conta de ${contabancaria.titular} é R$${contabancaria.consultarSaldo()}") //formatado como texto
    Thread.sleep(1000) // atraso no console de 1000 milisegundos = 1 segundo
    println("O valor do saldo da conta de ${contabancaria.titular} é ${consultarSaldoFormatado}")
}

//Crie uma classe ContaBancaria que tenha as seguintes funcionalidades:
//Propriedades:
//saldo: um valor do tipo Double que representa o saldo da conta.
//titular: o nome do titular da conta.
//
//Comportamentos:
//depositar(valor: Double): adiciona o valor passado ao saldo da conta.
//sacar(valor: Double): subtrai o valor passado do saldo.
//buscarSaldo(): retorne o saldo atual da conta.
//Regras:

//O saldo inicial da conta deve ser 0.0.
//O titular da conta deve ser definido após a criação do objeto
//Realize operações na conta para depositar 1200, sacar 500, e exibir o saldo final de 700 reais

//Exemplo de saida: O saldo de Mark Zuckenberg é de R$700.0