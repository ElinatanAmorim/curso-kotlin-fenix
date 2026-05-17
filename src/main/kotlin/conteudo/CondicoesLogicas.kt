package conteudo

fun main() {

//  Use if para condições booleanas simples e comparações únicas.
//  Use when para múltiplos casos ou para valores conhecidos, onde é possível comparar uma variável com diversos padrões de maneira mais limpa.

    val produto = "Tv1"
    if (produto.length < 3) {  //Se fosse utilizar a negação if ( !(produto.length <3) ) {
        println("Produto tem menos de 3 caracteres")
    } else {
        println("Produto cadastrado com sucesso!")
    }

    val preco = 20_000
    if (preco > 30_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco >= 20_000) {
        println("Você ganhou 20% de desconto")
    } else if (preco > 10_000) {
        println("Você ganhou 10% de desconto")
    } else {
        println("Você não ganhou desconto")
    }

    println("Insira um produto")
    val productId = readln().toInt()
    when(productId) {
        1, 3 -> {
            println("Você ganhou 10% de desconto!")
        }
        2 -> {
            println("Você ganhou 20% de desconto!")
        }
        else -> {
            println("Compra aprovada sem desconto")
        }
    }

    //Crie um programa que retorne se é fim de semana ( "SAB" ou "DOM" ) ou se é um dia útil
// ( "SEG", "TER", "QUA", "QUI" e "SEX" ). Se usuário forneça dia inválido, informar um erro.
    print("Insira um dia da semana: ")
    var diaDaSemana = readln()
    when(diaDaSemana){
        "sab", "dom" -> {
            println("Final de semana")
        }
        "seg", "ter", "qua", "qui", "sex" -> {
            println("Dia útil")
        }
        else -> {
        println("Você inseriu valor inválido, tente novamente!")
        }
    }
    //Opção2
    println("Olá, informe o dia da semana, sendo 1 para domingo e 7 para sábado: ")
    val dia = readln().toInt()

    when(dia) {
        1, 7 -> {
            println("O dia informado é um fim de semana")
        }
        in 2 .. 6 -> {       //in 3 until 5 -> {   // começa no 3 e vai até 5, caso eu queira os números dentro do intervalo
            println("O dia informada é um dia útil")
        } else -> {
            println("Dia da semana inválido, informe um valor entre 1 e 7")
        }
    }
}