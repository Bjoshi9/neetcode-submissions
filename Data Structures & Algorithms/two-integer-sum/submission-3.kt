class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val numMap = mutableMapOf<Int, Int>() // value -> index
        nums.forEachIndexed { index, num ->
            val complement = target - num
            if (numMap.containsKey(complement)) {
                return intArrayOf(numMap[complement]!!, index)
            }
            numMap[num] = index
        }
        return intArrayOf()
    }
}
