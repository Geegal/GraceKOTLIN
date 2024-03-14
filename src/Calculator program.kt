import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    print("Enter first number :")
    var first = input.nextInt()

    print("Enter operator  :")
    val operator  = input.next()[0]

    print("Enter second number :")
    var second = input.nextInt()


    val result  = when(operator){
        '+' ->  first + second
        '-' ->  first - second
        '*' ->  first * second
        '/' ->  first / second
        else -> {
            System.err.println("Not a valid operation")
            return
        }
    }
    println(result)




}