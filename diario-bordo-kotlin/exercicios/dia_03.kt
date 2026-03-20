//Exercicio 1 -  Criar um programa que percorra Crie um programa que percorra os números de 1 a 50 e imprima apenas os números pares

fun main(){
    for (i in 1..50 ){
        if(i % 2 == 0)
        
        print(i)
    }

}

//----------------------------------------------------------------------------------------

//exercicio 2 - Crie um programa que tenha uma palavra percorra cada letra conte quantas letras são vogais

fun main() {
    val palavra = "papibaquigrafo"
    var contador = 0

    for (letra in palavra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador++
        }
    }

    println("Quantidade de vogais: $contador")
}
//----------------------------------------------------------------------------------------
