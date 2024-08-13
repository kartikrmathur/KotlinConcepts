fun main (){
    val text = "aaadnasoflbsdfibsdfihv"
    val charsTocount  = charArrayOf('a','b')
    val counts = SampleHashMapQuestion(text,charsTocount)
    println("Occurences of a: ${counts['a']}")
    println("Occurences of b: ${counts['b']}")

}
fun SampleHashMapQuestion(text:String,chars:CharArray):Map<Char,Int>{
    val counts = mutableMapOf<Char,Int>()
    for (char in text){
        if(char in chars){
            counts[char] = (counts[char]?:0) + 1
        }
    }
    return counts
}
