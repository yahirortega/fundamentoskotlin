fun main(){
    println("Hello")
    sayHello()
    sayHelloTo( "peter")
    sayHelloToFrom( "Bruce wayn", " chicago")
    println("El doble de 25 es ${ duplicate( 25)}")
    val result = divide( 99,15.0)
    println(" El resultado de 99 / 15 es $result")
    println(fullName("john","snow"))

    welcomeToMexico()
    welcomeToMexico("spiterma")

    sayHelloToFrom("superman", "puebla")
    sayHelloToFrom(city = "tepito", name = "tayron")

}

// funciones sin parametros y sin retorno
fun sayHello(){
    println("Hello")
}

// functions whit params
fun sayHelloTo(name:String){
    println("Hello $name")
    println("welcome")
}
fun sayHelloToFrom(name: String, city: String) {
    println("Hello $name from $city")
}
fun duplicate(num: Int): Int {
    return num * 2
}
fun divide(num1: Int, num2: Double): Double {
    return  num1 / num2
}
fun fullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// Functions with optional
fun welcomeToMexico(name: String = "Invitado"): Unit{
    println("Welcome to Mexico $name")
}

