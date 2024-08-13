package Arrays

fun main (){
shuffle()}

fun add() {
    val SumArray = arrayOf(1,2,3)

    println(SumArray.sum())
}

fun shuffle(){
    val simpleArray = arrayOf(1,2,3)

    simpleArray.shuffle()
    println(simpleArray.joinToString ())

    simpleArray.shuffle()
    println(simpleArray.joinToString())
}
