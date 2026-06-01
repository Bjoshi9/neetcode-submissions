class Solution {

    fun encode(strs: List<String>): String {
        val encodedString = StringBuilder()
        strs.forEach { str ->
            encodedString.append("${str.length}#$str")
        }
        return encodedString.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            var j = i
            while (str[j] != '#') j++ // find '#'
            
            val length = str.substring(i, j).toInt()
            result.add(str.substring(j + 1, j + 1 + length))
            i = j + 1 + length
        }

        return result
    }
}
