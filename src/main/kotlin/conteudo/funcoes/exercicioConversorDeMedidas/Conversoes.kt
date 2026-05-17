package conteudo.funcoes.exercicioConversorDeMedidas

class Conversoes {

    fun CelsiusParaFahrenheit(valor: Double): Double {
        return (valor * 1.8) + 32
    }

    fun FahrenheitParaCelsius(valor: Double): Double {
        return (valor - 32) / 1.8
    }

    fun KMParaMilhas(valor: Double): Double {
        return valor * 0.6214
    }

    fun MilhasParaKM(valor: Double): Double {
        return valor * 1.60934
    }
}