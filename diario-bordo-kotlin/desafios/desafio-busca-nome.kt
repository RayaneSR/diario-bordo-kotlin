fun main() {
    val nomes = arrayOf("Rayane", "Carol", "Aline", "Djamila")
    val busca = "Rayane"

    var encontrado = false

    for (nome in nomes) {
        if (nome == busca) {
            encontrado = true
        }
    }

    if (encontrado) {
        println("Nome encontrado!")
    } else {
        println("Nome não encontrado!")
    }
}