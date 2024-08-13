package General

public class Conditionals {
    fun main (){
    //    val trafficLightColor = "Red"
    //    val trafficLightColor = "Green"
    //    val trafficLightColor = "Yellow"
        val trafficLightColor = "Black"
        if(trafficLightColor == "Red"){
            println("Stop")
        } else if (trafficLightColor == "Yellow"){
            println("Slow")
        } else if (trafficLightColor == "Green"){
            println("Go")
        } else {
            println("Invalid Traffic light")
        }
        when(trafficLightColor){
            "Red"-> println("Stop")
            "Green"-> println("Go")
            "Yellow"-> println("Slow")
            else -> println("InvalidTrafficLight")
        }

        val x = 3
        when(x){
            2,3,4,5 -> println("x is a prime bw 1 to 10")
            else -> println("x is a non prime bw 1 to 10")
        }

        val x1 = 3

        when(x1){
            2,3,4,5 -> println("x1 is a prime number bw 2 and 10")
            in 1..10 -> println("x1 is a number in bw 1 and 10")
            else -> println("x1 isnt a prime number bw 1 and 10")
        }

//        Use if- else as a expressions
        val trafficLightColors = "Black"

        val message =
            if (trafficLightColors == "Red") "Stop"
            else if (trafficLightColors == "Yellow") "Slow"
            else if (trafficLightColors == "Green") "Go"
            else "Invalid traffic-light color"
        println(message)

    }

}