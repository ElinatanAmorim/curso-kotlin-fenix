package conteudo.oop.constEval

import conteudo.oop.construtor.User

fun main() {

    val userA = User("Natan") // Contador incrementa para 1
    val userB = User("Matteo") // Contador incrementa para 2

    User.resetCount() // Reseta contador para 0
    val userC = User("Suzy") // Contador incrementa para 1
}

class User(var name: String, var isAdmin: Boolean) {

    //var count = 0 - aqui seria propriedade e comportamento do objeto, cada objeto seria inicializado o count do zero

    companion object { // Propriedades e comportamentos da Classe
        var count = 0

        fun resetCount() {
            count = 0
            println("Contador redefinido para: $count")
        }
    }

    init {
        count++
        println("Novo usuário criado. Contador: $count")
    }

    constructor(name: String) : this(name, isAdmin = false) {
        println("Construtor secundário chamado para: $name")
    }

    constructor() : this("Desconhecido") {
        println("Construtor terciário chamado.")
    }
}

