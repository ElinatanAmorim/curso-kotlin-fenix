package conteudo.oop.constEval

fun main() {

    val circulo = Circulo()

    print("Insira o valor do raio: ")
    val raio = readln().toInt()
    circulo.raio = raio  // Atribuindo o valor do raio ao objeto

    println("O valor da área do círculo, com raio de ${circulo.raio} é de: ${circulo.calcularAreaCirculo()}")
}

//    Exercício
//    Implemente uma classe Circulo que calcula a circunferência de um círculo. O valor de PI deve ser definido como uma constante global utilizando const val, pois o valor de PI nunca muda. A classe deve ter um método calcularCircunferencia que retorna a circunferência do círculo.
//    A formula é: 2 * PI * raio
//    Exemplo de saida: A circunferência do círculo com raio 5.0 é: 31.4159