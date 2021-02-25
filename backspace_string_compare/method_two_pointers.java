package backspace_string_compare;

public class method_two_pointers {
    public boolean backspaceCompare(String S, String T) {
        if (S == null || T == null) {
            return false;
        }
        int index1 = S.length() - 1;
        int index2 = T.length() - 1;
        int well1 = 0;
        int well2 = 0;
        while (index1 >= 0 || index2 >= 0) {
            while (index1 >= 0) {
                if (S.charAt(index1) == '#') {
                    well1++;
                    index1--;
                } else if (well1 > 0) {
                    well1--;
                    index1--;
                } else {
                    break;
                }
            }
            while (index2 >= 0) {
                if (T.charAt(index2) == '#') {
                    well2++;
                    index2--;
                } else if (well2 > 0) {
                    well2--;
                    index2--;
                } else {
                    break;
                }
            }
            if (index1 >= 0 && index2 >= 0) {
                if (S.charAt(index1) != T.charAt(index2)) {
                    return false;
                }
            } else if (index1 >= 0 || index2 >= 0) {
                return false;
            }
            index1--;
            index2--;
        }
        return true;
    }
}
