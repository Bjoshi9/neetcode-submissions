class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val visited = HashSet<Int>()
        for(num in nums) {
            if(!visited.add(num)){
                return true
            }
        }
        return false
    }
}
