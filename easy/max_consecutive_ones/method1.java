package easy.max_consecutive_ones;

// 485
// https://leetcode-cn.com/problems/max-consecutive-ones/p
public class method1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] == 1) {
                    cnt = 1;
                    max = 1;
                }
                continue;
            }
            if (nums[i] == 0) {
                cnt = 0;
            } else {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            }
        }
        return max;
    }
}
