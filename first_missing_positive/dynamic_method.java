package first_missing_positive;

public class dynamic_method {

    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i=0;i<len;i++) {
            if (nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }
        int[] dupNums = nums.clone();
        for (int i=0;i<len;i++) {
            if (nums[i] <= len) {
                dupNums[nums[i] - 1] = -1;
            }
        }
        for (int i=0;i<len;i++) {
            if (dupNums[i] != -1 ) {
                return i + 1;
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        dynamic_method example = new dynamic_method();
        System.out.println(example.firstMissingPositive(nums));
    }
}
