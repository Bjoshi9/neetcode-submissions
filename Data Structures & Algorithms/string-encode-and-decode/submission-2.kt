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
        var j = -1 //The last index of string

        while (i < str.length) {
            if(str[i] == '#') {
                j = str.substring(j+1, i).toInt() + i 
                result.add(str.substring(i+1, j + 1)) 
                i = j
            }
            i++ 
        }

        return result
    }
}
