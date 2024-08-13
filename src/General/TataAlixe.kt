package General

class TataAlixe {

    fun countChars(str: String): Map<Char, Int> {
        val charCount = mutableMapOf<Char, Int>()
        str.forEach { char ->
            val count = charCount[char] ?: 0
            charCount[char] = count + 1
        }
        return charCount
    }

    fun main() {
        val inputString = "aaabacasdcsdofnbsdofbh"
        val charCounts = countChars(inputString)

        val countA = charCounts['a'] ?: 0
        val countB = charCounts['b'] ?: 0

        println("Number of 'a': $countA")
        println("Number of 'b': $countB")
    }

}