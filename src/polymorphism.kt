    //Parent class
    open class Shape{
        open fun draw(){
            println("Drawing a shape")
        }

    }

    //Child class
    class Rhombus:Shape(){
        override fun draw(){
            //borrowing a function but not exactly doing what the original function was doing,
            // we add override to the function
            println("Drawing a rhombus")
        }
    }

    class Parallelogram:Shape(){
        override fun draw(){
            //borrowing a function but not exactly doing what the original function was doing,
            // we add override to the function
            println("Drawing a parallelogram")
        }
    }

    fun main() {
        var s = Shape()
        s.draw()
        var r = Rhombus()
        r.draw()
        var p = Parallelogram()
        p.draw()
    }