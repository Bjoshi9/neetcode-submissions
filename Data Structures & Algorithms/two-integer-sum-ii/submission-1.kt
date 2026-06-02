class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        numbers.forEachIndexed { index, num -> 
            val key = target - num 
            if(map.containsKey(key)) return intArrayOf(map[key]!!, index+1)
            map[num] = index + 1
        }
        return intArrayOf()
    }
}
