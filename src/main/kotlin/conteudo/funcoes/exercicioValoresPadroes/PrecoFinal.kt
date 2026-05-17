package conteudo.funcoes.exercicioValoresPadroes

fun main() {

    val priceOrigin = 100.0
    val percentDesconto = 0.1
    val percentImposto = 0.05
    val promocao = "Black Friday"
    val precoFinal = priceOrigin - (priceOrigin * percentDesconto) - (priceOrigin * percentImposto)

    if(promocao != "") {
        print("O valor final da $promocao é $precoFinal")
    } else {
        print("O valor final é $precoFinal")
    }
    //Outra maneira de fazer
    descontosla(precooriginal = 79.90, desconto = 29.90, imposto = 20.0, promocao = "Natal")
    descontosla(precooriginal = 90.0, desconto = 50.0, promocao = "Black Friday")
    descontosla(precooriginal = 30.0, desconto = 10.0, imposto = 15.0)
}

fun descontosla(precooriginal:Double,desconto :  Double = 0.0,imposto: Double =5.0, promocao:String = ""){
    var precooriginaldesconto = precooriginal - desconto
    var precofinal = precooriginaldesconto + imposto

    println("\nResumo da Transação =====")
    println("Preço Original: R$$precooriginal")
    if(desconto > 0 )println("Desconto: R$$desconto")
    if(imposto > 0)println("Imposto: R$$imposto")
    if(promocao != "")println("Promoção: $promocao")
    println("Preço final: R$$precofinal")
    println("\n")
}

/*Crie um programa que implementa uma função para calcular o desconto aplicado em uma compra e exibir um resumo da transação.

A função deve usar argumentos nomeados para facilitar a configuração dos parâmetros.
Então você vai precisar do preço original do produto [Double], o valor do desconto em reais [Double],
o valor de imposto (taxa para o cliente) em reais [Double] e qual o nome da promoção (se houver) [String]

Use o recurso de valores padrão para um imposto fixo de 5 reais na transação caso não seja informado outro valor.

DICA: Considere que nem todas transações serão de promoção. (ver saída abaixo)
DICA: Considere que nem todas transações terão valor de desconto. (ver saída abaixo)

REGRA: O Desafio deve ser concluído com uma unica função, ou seja, não pode haver sobrecarga de função.

Saida esperada:
Resumo da Transação ======
Preço Original: R$100.0
Desconto: R$10.0
Imposto: R$5.0
Promoção: Black Friday
Preço Final: R$95.0

Resumo da Transação ======
Preço Original: R$200.0
Imposto: R$20.0
Preço Final: R$220.0

Resumo da Transação ======
Preço Original: R$50.0
Imposto: R$5.0
Promoção: Natal
Preço Final: R$55.0

 */