class Solution {
    public void solve(char[][] board) {
        boolean visited[][] = new boolean[board.length][board[0].length];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'O' && !visited[row][col]) {
                    if (isbounded(board, visited, row, col)) {
                        dfs(board, row, col);
                    }
                }
            }
        }
    }

    public boolean isbounded(char[][] board, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if (visited[row][col] || board[row][col] == 'X') {
            return true;
        }

        visited[row][col] = true;

        boolean result = true;
        result &= isbounded(board, visited, row + 1, col);
        result &= isbounded(board, visited, row - 1, col);
        result &= isbounded(board, visited, row, col + 1);
        result &= isbounded(board, visited, row, col - 1);

        return result;
    }

    public void dfs(char[][] board, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return;
        }
        if (board[row][col] == 'O') {
            board[row][col] = 'X';
            dfs(board, row + 1, col);
            dfs(board, row - 1, col);
            dfs(board, row, col + 1);
            dfs(board, row, col - 1);
        }
    }
}
