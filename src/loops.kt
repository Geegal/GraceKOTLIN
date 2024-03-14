fun main() {
    //While loop
    //only prints out a value if condition set is true
    var number = 200
    while (number <= 205) {
        println("Number is $number")
        number++ //Must have the incrementing part or it would print endlessly
    }


     var num1 = 100
    while (num1 >= 95){
        println("Number is $num1")
    num1--
    }

    //Do ...while loop
    // prints even if the condition is wrong
    var num = 20
    do {
        println(num)
        num++
    }while (num<= 25)

    //for loop
    //no condition is necessary
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture) {
        println(z)
    }

    var marks = arrayOf(90,95,86,89,98)
    for (y in marks) {
        println("Mark is $y")
    }

    for (number in 30..35){
        println(number)
    }

    for (letter in 'a'..'d') {
        println(letter)
    }
}



