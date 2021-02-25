package plus_one;

import java.util.Arrays;

public class method_mock {
    public int[] plusOne(int[] digits) {
        // 两个特殊情况
        // 1. 9
        // 2. xxx9
        int c = 0;
        for (int i=digits.length - 1;i >= 0;i--) {
            if (digits[i] != 9) {
                digits[i]++;
                c = 0;
                break;
            }
            digits[i] = 0;
            c = 1;
        }
        if (c == 1 && digits[0] == 0) {
            int[] newArray = new int[digits.length+1];
            Arrays.fill(newArray,0);
            newArray[0] = 1;
            return newArray;
        }
        return digits;
    }
}
