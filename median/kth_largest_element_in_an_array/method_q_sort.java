package median.kth_largest_element_in_an_array;

// 215
// https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
public class method_q_sort {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        if (right < k - 1) {
            return -1;
        }
        int index = partition(nums, left, right);
        while (index != k-1) {
            if (index > k-1) {
                right = index - 1;
            } else {
                left = index + 1;
            }
            index = partition(nums, left, right);
        }
        return nums[index];
    }

    private int partition(int[] nums, int left, int right) {
        int tmp = nums[(left + right) / 2];
        nums[(left + right) / 2] = nums[left];
        nums[left] = tmp;
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] <= pivot) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
            }
            while (left < right && nums[left] > pivot) {
                left++;
            }
            if (left < right) {
                nums[right] = nums[left];
            }
        }
        nums[left] = pivot;
        return left;
    }
}
