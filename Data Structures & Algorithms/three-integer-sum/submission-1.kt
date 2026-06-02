class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for(index in nums.indices) {
            if(nums[index] > 0) break
            if(index > 0 && nums[index] == nums[index - 1]) continue

            var left = index + 1
            var right = nums.size - 1
            while(left < right){
                val sum = nums[index] + nums[left] + nums[right]
                when {
                    sum > 0 -> right--
                    sum < 0 -> left++
                    else -> {
                        result.add(listOf(nums[index], nums[left], nums[right]))
                        left++
                        right--
                        while(left<right && nums[left] == nums[left-1]){
                            left++
                        }
                    }
                }
            }
        }
        return result
    }
}
