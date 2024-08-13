package InterviewQuestions

class TataAlixeStringProblem {

    fun main() {
        val string = "aabdhdsfguedyfgvewyg"
        val counts = countChars(string)

        val countA = counts.getOrDefault('a', 0)
        val countB = counts.getOrDefault('b', 0)

        println("Number of 'a': $countA")
        println("Number of 'b': $countB")
    }

    fun countChars(str: String): Map<Char, Int> {
        val charCounts = mutableMapOf<Char, Int>()
        for (char in str) {
            val count = charCounts.getOrDefault(char, 0) + 1
            charCounts[char] = count
        }
        return charCounts
    }
}