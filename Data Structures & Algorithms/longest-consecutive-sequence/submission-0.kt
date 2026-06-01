class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var maxLen = 0

        for (num in numSet) {
            if (num - 1 !in numSet) {  // start point!
                var current = num
                var count = 1
                while (current + 1 in numSet) {
                    current++
                    count++
                }
                maxLen = maxOf(maxLen, count)
            }
        }

        return maxLen
    }
}
