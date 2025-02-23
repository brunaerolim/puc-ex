// 🔄 Exercise 2: Bubble Sort Algorithm
//
// Objective: Implement the **Bubble Sort** algorithm to sort an array of integers in **ascending order**.
//
// 📌 Rules:
// - The algorithm must iterate through the array multiple times, swapping adjacent elements if they are out of order.
// - The worst-case time complexity is **O(n²)**.
// - The function should modify the array in-place.
//
// 🏆 Example:
// val nums = intArrayOf(5, 3, 8, 4, 2)
// bubbleSort(nums)
// println(nums.joinToString()) // Expected output: 2, 3, 4, 5, 8
//
// 🔍 Hints:
// - Use **two nested loops** to compare adjacent elements.
// - If `nums[j] > nums[j+1]`, swap them.
// - If no swaps are made in a full iteration, the array is already sorted.

fun bubbleSort(nums: IntArray) {
    val n = nums.size

    for (i in 0 until n) {
        var swapped = false

        for (j in 0 until n - i - 1) {
            if (nums[j] > nums[j + 1]) {
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
                swapped = true
            }
        }
        if (!swapped) break
    }
}