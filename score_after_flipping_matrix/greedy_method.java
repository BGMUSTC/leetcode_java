package score_after_flipping_matrix;

public class greedy_method {
    public int matrixScore(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return 0;
        }
        for (int i=0;i<A.length;i++) {
            if (A[i][0] == 0) {
                for (int j=0;j<A[i].length;j++) {
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }
            }
        }
        int dev = A.length / 2;
        for (int i=1;i<A[0].length;i++) {
            int cntZeros = 0;
            for (int j=0;j<A.length;j++) {
                if (A[j][i] == 0) {
                    cntZeros++;
                }
            }
            if (cntZeros > dev) {
                for (int j=0;j<A.length;j++) {
                    A[j][i] = A[j][i] == 0 ? 1 : 0;
                }
            }
        }
        int res = 0;
        for (int i=0;i<A.length;i++) {
            res += calRes(A[i]);
        }
        return res;
    }

    private int calRes(int[] ints) {
        int res = 0;
        for (int i=0;i<ints.length;i++) {
            res = (res << 1) + ints[i];
        }
        return res;
    }

    public static void main(String[] args) {
        greedy_method example = new greedy_method();
        int[][] arr = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(example.matrixScore(arr));
    }
}
