package how_many_numbers_are_smaller_than_the_current_number;

import java.util.Arrays;
import java.util.HashMap;

public class method_hash_sort {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cpNums = Arrays.copyOf(nums,nums.length);
        Arrays.sort(cpNums);
        HashMap<Integer,Integer> m = new HashMap<>();
        int sameCnt = 0;
        int cnt = 0;
        int[] res = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            if (i - 1 >= 0) {
                if (cpNums[i-1] == cpNums[i]) {
                    sameCnt++;
                } else {
                    cnt = m.get(cpNums[i-1]) + sameCnt + 1;
                    sameCnt = 0;
                }
            }
            m.put(cpNums[i],cnt);
        }
        for (int i=0;i<nums.length;i++) {
            res[i] = m.get(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        method_hash_sort example = new method_hash_sort();
        int[] arr = {8,1,2,2,3};
        int[] res = example.smallerNumbersThanCurrent(arr);
        for (int r : res) {
            System.out.print(r + "             ");
        }
        System.out.println();
    }
}
