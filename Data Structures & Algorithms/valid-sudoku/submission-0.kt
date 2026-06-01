class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for (r in 0..8) {
            for (c in 0..8) {
                val cell = board[r][c]
                if (cell == '.') continue

                val boxIndex = (r / 3) * 3 + (c / 3)

                if (!rows[r].add(cell)) return false
                if (!cols[c].add(cell)) return false
                if (!boxes[boxIndex].add(cell)) return false
            }
        }
        return true
    }
}
