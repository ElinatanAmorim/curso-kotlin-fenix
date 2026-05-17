package conteudo.oop.construtor

import javax.swing.text.StyledEditorKit.BoldAction

fun main() {
    val userA = User("Natan") // Contador incremental para 1
    val userB = User("Matteo") // Contador incremental para 2

    User.resetCount() // Chamando a função para resetar o contador
    val userC = User("Suzy") // Contador incrementa para 1
}

//construtor primário
class User(var name: String, var isAdmin: Boolean) {
    
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