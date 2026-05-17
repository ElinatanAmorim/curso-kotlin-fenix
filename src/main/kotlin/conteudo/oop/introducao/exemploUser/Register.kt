package conteudo.oop.introducao.exemploUser

fun main() {

    val userA = User()
    val userB = User()

    userA.name = "Natan"
    userA.password = "3728"
    userB.name = "Suzy"
    userA.password = ""

    println(userA.getNameLength())
    userA.printUpperCase()
    userA.updateName("Matteo")
    userA.printUpperCase()

    val nameLength = userA.getNameLength()

    println(nameLength)

    println("Antes do cadastro de senha")
    println(userA.name)
    println(userA.password)

    println("Depois do cadastro de senha")
    userA.updatePassword(userA.name)
    print(userA.password)

}