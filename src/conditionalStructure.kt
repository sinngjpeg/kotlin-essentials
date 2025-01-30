class conditionalStructure {}

fun main(){

    var idade = 18

    if (idade >= 18) {
        println("O usuário é maior de idade")
    } else {
        println("o usuário é menor de idade")
    }

    if (idade <=10){
        println("Criança")
    } else if (idade <= 17){
        print("Adolecesnte")
    } else {
        println("Adulto")
    }
}