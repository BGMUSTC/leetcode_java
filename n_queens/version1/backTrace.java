package n_queens.version1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class backTrace {
    private static List<String> charToString(char[][] chars) {
        List<String> result = new LinkedList<>();
        for (char[] chss : chars) {
            result.add(String.valueOf(chss));
        }
        return result;
    }

    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        if (n == 0 ){
            return null;
        }
        res = new LinkedList<>();
        char[][] board = new char[n][n];
        for (char[] chars : board) {
            Arrays.fill(chars,'.');
        }
        backTraceFun(board,0);
        return res;
    }

    private void backTraceFun(char[][] board, int row) {
        if (row == board.length) {
            res.add(charToString(board));
            return;
        }
        int n = board[row].length;
        for (int col = 0;col < n;col++) {
            if (!isValid(board,row,col)) {
                continue;
            }
            board[row][col] = 'Q';
            backTraceFun(board,row+1);
            board[row][col] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        int rows = board.length;
        // 列
        for (char[] chars : board) {
            if (chars[col] == 'Q') {
                return false;
            }
        }
        // 左上
        for (int i = row - 1,j = col - 1;i >= 0 && j >= 0;i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // 右上
        for (int i = row - 1,j = col + 1;i >= 0 && j < board[i].length;i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

}
