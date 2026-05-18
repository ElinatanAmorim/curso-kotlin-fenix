package conteudo.funcoes.exercicioIMC

fun main() {

//    val peso = 87.0
//    val altura = 1.72
    println("Digite seu peso: ")
    val peso = readLine()?.toDouble()?: 0.0
    println("Digite sua altura: ")
    val altura = readLine()?.toDouble()?: 0.0


    val calculadora = ClassificacaoImc()
    val resultadoImc = calculadora.imc(peso, altura)
    val classificacao  = calculadora.classificacaoIMC(resultadoImc)

    println("O resultado do seu imc é: %.2f".format(resultadoImc) + " e sua classificação faixa: " + classificacao)

    if(resultadoImc <0){
        println("Resultado Inválido")}
    else{
        println(classificacao)
    }
}




