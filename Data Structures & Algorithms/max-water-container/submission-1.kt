class Solution {
    fun maxArea(heights: IntArray): Int {

        var left = 0
        var right = heights.size - 1
        var maxWater = 0

        while(left < right) {
            val water = min(heights[left], heights[right]) * (right - left)
            maxWater = maxOf(maxWater, water)
            if (heights[left] < heights[right]) left++
            else right--
        }

        return maxWater 

    }
}
