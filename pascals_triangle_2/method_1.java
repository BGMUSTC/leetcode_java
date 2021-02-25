package pascals_triangle_2;

import java.util.ArrayList;
import java.util.List;

public class method_1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i < rowIndex+1; i++) {
            res.add(0);
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        method_1 example = new method_1();
        List<Integer> res = example.getRow(3);
        for (int i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }
    }
}
