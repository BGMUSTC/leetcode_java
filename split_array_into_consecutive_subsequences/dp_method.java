package split_array_into_consecutive_subsequences;

// 参考： https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences/solution/tan-xin-o1-kong-jian-fu-za-du-de-zui-you-jie-fa-by/
public class dp_method {
    public boolean isPossible(int[] nums) {
        int dp1 = 0, dp2 = 0, dp3 = 0;
        int i = 0;
        while (i < nums.length) {
            int start = i;
            while (i < nums.length && nums[start] == nums[i]) {
                i++;
            }
            int cnt = i - start;
            if (start > 0 && nums[start] != nums[start - 1] + 1)  {
                if (dp1 + dp2 > 0) {
                    return false;
                } else {
                    dp1 = cnt;
                    dp2 = dp3 = 0;
                }
            } else {
                if (dp1 + dp2 > cnt) {
                    return false;
                } else {
                    int left = cnt - dp1 - dp2;
                    int keep = Math.min(left, dp3);
                    dp3 = keep + dp2;
                    dp2 = dp1;
                    dp1 = left - keep;
                }
            }
        }
        return dp1 == 0 && dp2 == 0;
    }
}
