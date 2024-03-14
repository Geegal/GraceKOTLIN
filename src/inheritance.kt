    //Parent class/Super class/Base class
    open class Animal{
        //open  is a keyword that specifies that any other class can access this one
        var age = 2
        var gender = "female"

        fun move(movement:String){
            println("Animal is $movement")

        }

    }
    //Child class/Sub-class/Derived class
    //to ensure that class duck inherits from class animal,immediately after the name of class duck,
    // you add colon then
    // specify the class it is inheriting and the brackets
    open class Duck:Animal(){
        var color = "white"
        fun sound(){
            println("Duck is quacking")
        }
    }

    class Fish:Duck(){
        //TO avoid repetition you make fish inherit from class duck
        var hasscales = true
        var hasfins = true

        fun eat(){
            println("Fish is eating")
        }
    }

    fun main() {
        var a = Animal()

        var d = Duck()
        println(d.gender)
        d.move("swimming")

        var nileperch = Fish()
    }