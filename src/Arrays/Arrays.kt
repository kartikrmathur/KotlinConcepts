package Arrays

fun main(){
    compareArrays()
}

fun Array(){
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    // Using the += assignment operation creates a new riversArray,
    // copies over the original elements and adds "Mississippi"
    riversArray += "Mississippi"
    println(riversArray.joinToString())
}

//   Creates a simple array
fun simpleArray(){
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())
}

//   Creates an array with null
fun nullArray(){
    val nullArray: Array<Int?> = arrayOfNulls(3)
//    println(nullArray.toString())
    println(nullArray.joinToString())
}

fun exampleArray(){
    val initArray = Array<Int>(3) { 0 }
    println("Initial Array"+initArray.joinToString())

// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }

    val twoD = Array(2) { Array<Int>(2){0} }
    println(twoD.contentDeepToString())

    val threeD = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeD.contentDeepToString())

}
//To pass an array containing a variable number of arguments to a function,
// use the spread operator (*).
fun passvariableArgumenttofunction() {
    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray)
    // abcd
}

fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
}

//  To compare whether two arrays have the same elements in the same order,
//  use the .contentEquals() and .contentDeepEquals() functions:

fun compareArrays(){
    val simpleArray = arrayOf(1,2,3)
    val anotherArray = arrayOf(1,2,3)

    println("Are array same?:- "+simpleArray.contentEquals(anotherArray))

    simpleArray[0] = 10
    println("content in both array are same :- ")
    println(simpleArray contentEquals anotherArray)
}
