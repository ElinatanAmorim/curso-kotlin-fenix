package conteudo.oop.encapsulamento

    fun main() {

    val controle = PlayVolume(volume = 10)
    controle.aumentarVolume()
    controle.aumentarVolume()
    controle.aumentarVolume()
    controle.diminuirVolume()
    controle.exibirVolume()
}


class PlayVolume(private var volume: Int) {

    val maxVolume = 100

    fun aumentarVolume() {
        if (validarVolume()) {
            volume += 10
        } else {
            println("$volume - Seu volume está no máximo $maxVolume")
        }
    }

    fun diminuirVolume() {
        if (validarVolume()) {
            volume -= 10
        } else {
            println("Volume está fora do limite")
        }
    }

    private fun validarVolume(): Boolean{
        if (volume > 0 && volume <100) {
            return true
        }
        return false
    }

    fun exibirVolume(){
        println("Volume $volume")
    }
}