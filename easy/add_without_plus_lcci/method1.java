package easy.add_without_plus_lcci;

// 面试题17.01
// https://leetcode-cn.com/problems/add-without-plus-lcci/
public class method1 {
    public int add(int a, int b) {
        int tmp1 = 0;
        int tmp2 = 0;
        while (b != 0) {
            tmp1 = a ^ b;
            tmp2 = (a & b) << 1;
            a = tmp1;
            b = tmp2;
        }
        return a;
    }
}
