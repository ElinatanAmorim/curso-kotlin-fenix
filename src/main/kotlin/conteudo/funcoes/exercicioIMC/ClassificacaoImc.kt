package conteudo.funcoes.exercicioIMC

class ClassificacaoImc {

    fun imc(peso: Double, altura:Double):Double{
        return peso / (altura * altura)
    }

    fun classificacaoIMC(imc: Double):String {
        return when {
            imc < 18.5 -> "Abaixo do peso"
            imc in 18.5 .. 24.9 -> "Peso normal"
            imc in 25.0 .. 29.9 -> "Peso normal"
            else -> "Obesidade"
        }
    }
}
/*
Crie uma função chamada calcularIMC que receba o peso e a altura
de uma pessoa e retorne uma mensagem com a classificação do IMC.

FÓRMULA: IMC = peso / (altura * altura)

CLASSIFICAÇÃO:
"Abaixo do peso" se IMC < 18.5
"Peso normal"    se IMC entre 18.5 e 24.9
"Sobrepeso"      se IMC entre 25.0 e 29.9
"Obesidade"      se IMC >= 30

IMPORTANTE:
- Peso e altura devem ser números decimais (Double)
- Valide se peso e altura são maiores que zero
- Valide se a entrada é um número válido
- Repita a pergunta até receber um valor válido

A saída deve ser algo como:
Peso: 70.0kg | Altura: 1.75m | IMC: 22.86 | Peso normal
*/