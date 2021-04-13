package squares_of_a_sorted_array;

public class method_1 {

    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int index = A.length - 1;
        int[] res = new int[right + 1];
        while (index >= 0) {
            if (A[left] + A[right] < 0) {
                res[index--] = A[left] * A[left];
                left++;
            } else {
                res[index--] = A[right] * A[right];
                right--;
            }
        }
        return res;
    }
}
