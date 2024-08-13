package Arrays

fun main(){
    convertToMap()
}

fun convertToList() {
    var simpleArray = arrayOf("a","b","c","c")
    println(simpleArray.toSet())
    println(simpleArray.toList())
}

fun convertToMap(){
    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)
    println(pairArray.toMap())
}
