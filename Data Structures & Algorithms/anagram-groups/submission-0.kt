class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        strs.forEach {
            val key = it.toCharArray().sorted().joinToString("")
            map.getOrPut(key) {mutableListOf()}.add(it)
        }

        return map.values.toList()

    }
}
