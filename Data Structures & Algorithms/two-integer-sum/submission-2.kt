class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indices = HashMap<Int, Int>() 
        
        for((i, n) in nums.withIndex()) {
            indices[n] = i
        }

        for((i, n) in nums.withIndex()) {
            val diff = target - n
            if(indices.containsKey(diff) && indices[diff] != i) {
                return intArrayOf(i, indices[diff]!!)
            }
        }

        return intArrayOf()
    }
}
