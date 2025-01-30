class types {}

/*
    String - Textos
    byte - Números Inteiros (-128 até 127)
    int - Números Inteiros (-2147483648 até 2147483647)
    long - Números Inteiros (-9223372036854775808 até 9223372036854775807)
    float - Números Decimais (1.1234567 até 7 casas decimais)
    double - Números Decimais (1.123456789 até 15 casas decimais)
    boolean - Valores Booleanos (Estados) - true ou false

    O Kotlin sabe qual o tipo da variável através do valor que é passado (para a variável).
    Se voce colocar o mouse em cima da variável voce consegue ver qual o tipo da variável.
    O byte é o unico tipo que precisa ser definido para o programa reconhecer, caso contrario ele entende como inteiro.
 */

fun main(){

     val fullName: String = "Ingrid Silva"
     val age: Byte = 29
     val intNumber = 2147483647
     val longNumber = 9223372036854775807
     val floatNumber = 1.1234567f
     val doubleNumber = 1.123456789
     val statusTrue = true
     val statusFalse = false

    println(fullName)
    println(age)
    println(intNumber)
    println(longNumber)
    println(floatNumber)
    println(doubleNumber)
    println(statusTrue)
    println(statusFalse)
}