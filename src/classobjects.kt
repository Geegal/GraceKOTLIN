    class Person {
        //Attributes/Properties
        var name = "John"
        var age = 26
        var gender = "Male"

        //Method / Function
        fun walk() {
            println("Person is walking")

        }
    }

    fun main() {
        var accountant = Person()
        accountant.walk()

        println(accountant.walk())
    }