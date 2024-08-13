package ExtensionFunction

class Circle (val radius : Double) {
    // member function of class
    fun area(): Double{
        return Math.PI * radius * radius;
    }

}

fun main (){
    fun Circle.perimeter(): Double {
        return 2 * Math.PI * radius;
    }
        val newCircle  = Circle(2.5)
        println("Area of Circle ${newCircle.area()}")
        println("Area of Circle ${newCircle.perimeter()}")
}


