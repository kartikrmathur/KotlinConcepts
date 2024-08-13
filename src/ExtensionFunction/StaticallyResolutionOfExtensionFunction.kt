package ExtensionFunction

// Open class created to be inherited
open class A(val a:Int, val b:Int){
}

// Class B inherits A
class B():A(5, 5){}

fun main(){

    // Extension function operate defined for A
    fun A.operate():Int{
        return a+b
    }

    // Extension function operate defined for B
    fun B.operate():Int{
        return a*b;
    }

    // Function to display static dispatch
    fun display(a: A){
        print(a.operate())
    }

    // Calling display function
    display(B())
}
