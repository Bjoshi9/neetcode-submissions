class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEach { num ->
            map[num] = map.getOrDefault(num, 0) + 1
        }

        return map.keys.sortedByDescending { map[it] }.take(k).toIntArray()
    }
}
