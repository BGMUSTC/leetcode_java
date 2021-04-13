package sort_colors;

public class double_pointer {
    public void sortColors(int[] nums) {
        if (nums.length < 2) {
            return ;
        }
        int p = 0,q = nums.length - 1;
        for (int i = 0; i <= q; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p];
                nums[p++] = 0;
            }
            if (nums[i] == 2) {
                nums[i] = nums[q];
                nums[q--] = 2;
                if (nums[i] != 1) {
                    i--;
                }
            }
        }
        return ;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,0,1};
        double_pointer example = new double_pointer();
        example.sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
