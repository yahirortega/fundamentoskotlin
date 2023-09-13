fun main(){
    println("Hello World")

    val pi = 3.14
    var x = 34

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /= 5
    println(x)

    val firstName = "Frank"
    val lastName: String = "lopez"
    val fullName = firstName + " " + lastName

    val age: Int = 39
    val height: Double = 1.68

    var stars = 10

    // String Templetes
    // $ para imprimir variables
    // ${} para procesar antes de imprimir

    println("I'm $age years old")
    println("I'm $height de altura")
    println("Obtendre ${ stars + 10 } estrellas")


    println(fullName)
}