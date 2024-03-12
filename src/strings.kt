fun main() {
    var greeting = "Hello World"
    var firstname = "Grace"
    var lastname = "eMobilis"

        //String concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greeting[6])

    //Determining the position of an element
    println(greeting .indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string
    println(greeting.uppercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")

    //Size of a string
    println(greeting.length)
}