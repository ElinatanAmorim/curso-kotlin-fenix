package conteudo.oop.constEval

import kotlin.time.times

class Circulo  {

    companion object {
        const val PI = 3.14159
    }

    var raio: Int= 0

    fun calcularAreaCirculo(): Double {
        return 2 * PI * raio
    }
}

