// 🔍 Exercise 1: Binary Search Algorithm
//
// Objective: Implement a function that searches for a target element in a sorted array
// using the **binary search** algorithm.
//
// 📌 Rules:
// - The input array will always be **sorted**.
// - The function should return the **index** of the target if found; otherwise, return **-1**.
// - The algorithm must run in **O(log n)** time complexity.
//
// 🏆 Example:
// val nums = intArrayOf(1, 3, 5, 7, 9, 11)
// val target = 5
// println(binarySearch(nums, target)) // Expected output: 2
//
// 🔍 Hints:
// - Use **two pointers** (`left` and `right`) to divide the search range.
// - If `nums[mid] == target`, return `mid`.
// - If `nums[mid] > target`, move `right` to `mid - 1`.
// - Otherwise, move `left` to `mid + 1`.

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            return mid
        }

        if (nums[mid] > target) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return -1
}