package conteudo

fun main() {

    //aplicação do null quando estamos preenchendo um formulario onde os itens nao sao obrigatorios

    val endereco: String? = "Rua A"//O ? a String aceita null

    if(endereco != null) {
        println(endereco.length)
    } else {
        println("Endereço vazio")
    }

    val quantidadeCaractere = endereco?.length
    println(quantidadeCaractere)

    //operador elvis - quero definir o valor padrão caso a expressão não corresponda
    val qtdCaractere = endereco ?: 0
    println(qtdCaractere)

    //Crie um programa que simula o cadastro de um usuário, onde o nome do usuário pode ser opcional (nullable).
//  O desafio é garantir que o nome do usuário sempre apresente um texto, e se for nulo,
//  deve ser substituído por uma string padrão como "Usuário Desconhecido" usando o operador Elvis.
    //  A saída deve ser como: Bem-vindo(a), Steve Jobs! OU
    //  A saída deve ser como: Bem-vindo(a), usuário Desconhecido!

    print("Cadastre seu nome: ")
    val nome: String? = readln()

    if (nome == null || nome.isBlank()) {
        println("Bem-vindo, Usuario Desconhecido")
    } else {
        println("Bem-vindo, $nome!")
    }

    //Utilizando o elvis
    println("\nUtilizando o elvis")
    val name: String? = null
    val testeElvis = name ?: "Usuário Desconhecido!"
    print("Bem-vindo, $testeElvis!")
}