package conteudo.oop.introducao.exemploUser

class User {

    var name = ""
    var password = ""

    fun getNameLength(): Int {
        return name.length
    }

    fun printUpperCase() {
        println("Olá " + name.uppercase())
    }

    fun updateName(newName: String) {
        name = newName + " atualizado com sucesso!"
    }

    fun updatePassword(initialValue: String) {
        if(initialValue == ""){
            password = "123Teste"
        } else {
            val number =
                Math.abs(initialValue.hashCode())  //hasCode retorna um número que pode ser negativo, por isso o abs
            password = number.toString()
        }
    }
}