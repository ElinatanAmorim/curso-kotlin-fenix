package conteudo

fun main() {

    /*Tipos Primitivos:
        Byte - 8 bit número pequeno
        Short - 16 bit
        Int - 32 bit 99% dos casos - O int pode chegar até o numero de ~2 bilhões, isto é, 32 bits.
        Long - 64 bit muito grande
        Double - 64 bit
        Flout - 32 bit
        String

    Tipos Especiais
        char
        boolean
     */

    var name = "Elinatan"
    var sobrenome = "Amorim"
    var nomeCompleto = "Elinatan Amorim de \nOliveira"
    var firstname: Char = 'E' // aspas simples
    var primeiroCaractere = name[0]
    var primeiroCaractereFirst = name.first()
    var age= 34
    var height = 1.72
    var weight = 80
    var product= "Imac" //Tipo inferido
    var price: Double = 32.98 //Não precisa especificar
    var desconto: Float = 5.99f //float
    var long = 192L //posso colocar o nº reduzido e o 'L' para armazenar um espaço maior na memório como long
    var char: Char = '@'
    var programdaor: Boolean = true

    println(price::class) // o class mostra o tipo do dado
    println(long::class)
    println(char)

    println()
    println(firstname)
    println(primeiroCaractere)
    println(primeiroCaractereFirst)
    println("Meu nome é $name")
    println(age)
    println(weight)
    println(height)
    println("É programador? $programdaor")

    //Conversão Tipo Primitivo
    var priceProduct = 2.99
    var conversion = priceProduct.toInt() // o inverso seria .toDouble()
    println(conversion)

    println("$name \n$sobrenome")
    println(nomeCompleto)

    var price1 = 20
    var price2 = "25"
    val textoComoInteiro = price2.toInt()
    val soma = price1 + textoComoInteiro
    val number = 1_000_000 //forma correta de escrever números grandes

    println("O resultado da soma será $soma")
    println("O resultado da soma será ${price1 + textoComoInteiro}")
    println(number)
    var max: Long = Long.MAX_VALUE
    println(max)

}