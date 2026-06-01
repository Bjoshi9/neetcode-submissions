class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, num ->
            nums.forEachIndexed { i1, n1 ->
                if(index == i1) return@forEachIndexed
                if(num + n1 == target) return intArrayOf(index, i1)
            }
        }
        return intArrayOf()
    }
}
