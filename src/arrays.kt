fun main() {
    var languages = arrayOf("Kotlin","Javascript","Python","C++")

    //Accessing one element of an array
    println(languages[1])

    //Reassigning the value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }

    //Checking isf an element is in an array
    if ("PHP" in languages) {
        println("It exists")
    }
    else{
        println("It does not exist")
    }



}