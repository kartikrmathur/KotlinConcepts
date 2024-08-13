package Leetcode.Arrays

fun main(){
    val nums = arrayOf(3, 2, 2, 3)
    val valToRemove = 3

    // Call the removeElement function and store the new length
    val newLength = removeElement(nums, valToRemove)

//     Print the modified array (up to the new length)
    println("Modified array:")
    for (i in 0 until newLength) {
        print(nums[i])
        print(" ")
    }
}

fun removeElement(nums: Array<Int>, numberVal: Int): Int {
    // used as an index to be keep track of position where elements to kept track of position in
    // modified array
    var k = 0
    // iterate overall array
    for(i in nums.indices){
        // check if the current element is not equal to value to be removed
        if(nums[i] != numberVal){
            // current element is copied to position pointed by the index k
            // in the nums array
            nums[k] = nums[i]
            // index moved to next position [where a non matching element should be present]
            k+=1
        }
        // if the condition if (nums[i] != numberVal) is false,
        // it means the current element (nums[i]) is equal to the value to be removed (numberVal).
    }
    return k
}