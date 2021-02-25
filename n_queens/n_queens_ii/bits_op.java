package n_queens.n_queens_ii;

/**
 * 1、 x & -x 除最后一位1保留，其他位全部为0
 * 2、 x & (x - 1) 代表将最后一位1变为0
 */
public class bits_op {
    int res = 0;

    public int totalNQueens(int n) {
        dfs(n,0,0,0,0);
        return res;
    }

    private void dfs(int n, int row, int col, int ld, int rd) {
        if (row >= n) {
            res++;
            return;
        }
        // 将所有能放置Q的位置由0变为1，以便进行后续的位遍历
        int bit = ~(col | ld | rd) & ((1 << n) - 1);
        while (bit > 0) {
            int pick = bit & (-bit);
            // ld | pick : 如果ld=0000,pick=0010,ld|pick<<1 = 0100，意思是下一行的第二行不要再放了，因为处在斜下方
            dfs(n,row+1,col | pick, (ld | pick) << 1,(rd | pick) >> 1);
            bit &= bit - 1;
        }
    }


}
