package Leetcode.Arrays

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3 // Number of elements currently in nums1
    val nums2 = intArrayOf(2, 5, 6)
    val n = nums2.size // Number of elements in nums2

    merge(nums1, m, nums2, n)

    print("Merged array: ")
    for (num in nums1) {
        print("$num ")
    }
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var index1 = m - 1
    var index2 = n - 1
    var lastIndex = m + n - 1

    while (index2 >= 0) {

        if (index1 < 0 || nums1[index1] < nums2[index2]) {
            nums1[lastIndex] = nums2[index2]
            index2--
        } else {
            nums1[lastIndex] = nums1[index1]
            index1--
        }

        lastIndex--
    }

}