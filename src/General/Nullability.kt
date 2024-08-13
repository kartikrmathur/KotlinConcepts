package General

class Nullability {
    fun main (){
        var favoriteActor: String? = "Sandra Oh"
        println(favoriteActor)

        favoriteActor = null
        println(favoriteActor)
    }
    fun main2(){
        var number: Int? = 10
        println(number)

        number = null
        println(number)
    }

    fun main3() {
        var favoriteActor: String? = "Sandra Oh"
        println(favoriteActor?.length)
    }

    fun main4() {
        var favoriteActor: String? = "Sandra Oh"

        if (favoriteActor != null) {
            println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
        }else {
            println("You didn't input a name.")
        }
    }

    fun main5() {
        var favoriteActor: String? = "Sandra Oh"

        val lengthOfName = if (favoriteActor != null) {
            favoriteActor.length
        } else {
            0
        }

        println("The number of characters in your favorite actor's name is $lengthOfName.")
    }

    // Elvis Operator
    fun main6() {
        var favoriteActor: String? = "Sandra Oh"

        val lengthOfName = favoriteActor?.length ?: 0

        println("The number of characters in your favorite actor's name is $lengthOfName.")
    }
}