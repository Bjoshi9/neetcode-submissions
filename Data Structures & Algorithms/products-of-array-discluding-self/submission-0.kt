class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        result[0] = 1
        var prefix = nums[0]
        
        for(i in 1 until nums.size) {
            result[i] = prefix
            prefix *= nums[i]
        }
        
        var suffix = 1
        
        for(i in (nums.size-1) downTo 0) {
            result[i] *= suffix
            suffix *= nums[i]
            println("SUF $i = $suffix")
        }
        
    
        return result
    }
}
