package conteudo

import java.text.NumberFormat
import java.util.*

//Operadores aritmáticos aritméticos (+, -, *, /) e lógicos (&&, ||, !)

fun main() {
    val textoIdade = "34"
    println(textoIdade + " minha idade")

    val boolean = true
    println(!boolean) //a ! é a negação do boolean

    //1. Criar um programa que deverá comparar a igualdade de duas Strings. Ou seja, a string A é igual a string B?
    //2. Crie uma variável que armazene a sua idade e verifique se, com a idade informada, pode-se dirigir
// (regra para CNH → +18 anos pode dirigir)
    //3. Inverta a lógica, o    u seja, verifique se a idade informada NÃO pode dirigir
    //4. Para praticar condições compostas, verifique se é um motorista OU se ele tem 17 anos ou mais
    //5. Para praticar condições compostas, verifique se é um motorista E se ele tem mais de 30 anos
    //6. Crie um programa com 2 variáveis, uma que represente um nome de produto e outra que represente o preço.
// Agora, somente imprima uma mensagem como "desconto aplicado" quando o produto for iMac E o preço for maior ou igual
// a 10 mil. Imprima também o valor com desconto aplicado de 12% para esse produto.
// Ou seja, a saída deve ser algo como: desconto aplicado de 12%. Total a pagar: R$ 19360

    val produto1 = "a"
    val produto2 = "b"
    //item1
    println(produto1 == produto2)
    val age = 31
    val motorista = true

    //item2 e item3
    if (!(age >= 18)) {
        println("Maior de 18 anos, pode dirigir")
    } else {
        println("Menor de 18 anos, não é permitido dirigir")
    }

    //item4
    if (motorista && age >= 18) {
        println("Sou motorista e tenho 18 anos ou mais")
    } else if (motorista && age < 18) {
        println("Sou motorista mesmo sendo menor de idade")
    } else if (!motorista && age >= 18) {
        println("Não sou motorista, mas tenho 18 anos ou mais")
    } else {
        println("Não sou motorista e sou menor de idade")
    }

    //item5
    if (motorista && age > 30) {
        println("Sou motorista e tenho mais que 30 anos")
    } else {
        println("Sou motorista, mas não tenho mais de 30 anos")
    }

    //item6
    val produto = "Imac"
    val preco = 22_000
    val taxaDesconto = 12
    val desconto = taxaDesconto / 100.0 //precisei escrever 100.0 pois divisão de inteiros, retornará um inteiro

    if (produto == "Imac" && preco >= 10_000) {
        val total = preco - (preco * desconto)
        // Formatando o valor como moeda em real
        val formatoMoeda = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        val totalFormatado = formatoMoeda.format(total)
        println("desconto aplicado de 12% para este produto. Total a pagar: $totalFormatado")
    } else {
        println("O total a pagar: $preco")
    }
}