//Escreva um programa em Kotlin que recebe uma lista de 5 números inteiros como entrada
//e calcule a média desses números. Certifique-se de lidar com casos em que a lista pode estar vazia.

fun calcularMedia(numeros: List<Int>): Double {
    return if (numeros.isNotEmpty()) { // uso pra verificar se a lista está vazia
        numeros.average() // uso pra calcular a média
    } else {
        println("A lista está vazia.")
        0.0
    }
}

//Crie um programa que verifique uma variável utilizando o WHEN traduza as seguintes cores em inglês
//para o portugues: blue, red, green, yellow

fun traduzirCor(cor: String): String {
    return when (cor) {
        "blue" -> "azul"
        "red" -> "vermelho"
        "green" -> "verde"
        "yellow" -> "amarelo"
        else -> "Cor desconhecida"
    }
}

fun main() {
    val numeros = listOf(10, 20, 30, 40, 50)

    val media = calcularMedia(numeros)

    println("A média dos números é: $media")

    println(traduzirCor("blue"))
    println(traduzirCor("red"))
    println(traduzirCor("green"))
    println(traduzirCor("yellow"))

}