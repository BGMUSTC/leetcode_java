package valid_number;

public class method_mod {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char arr[] = s.trim().toCharArray();
        boolean seenNum = false;
        boolean seenE = false;
        boolean seenDot = false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                seenNum = true;
            } else if (arr[i] == '.') {
                if (seenDot || seenE) {
                    return false;
                }
                seenDot = true;
            } else if (arr[i] == 'E' || arr[i] == 'e') { // e前不能有e，并且必须要有数字
                if (seenE || !seenNum) {
                    return false;
                }
                seenNum = false;
                seenE = true;
            } else if (arr[i] == '+' || arr[i] == '-') {
                if (i != 0 && arr[i-1] != 'e' && arr[i-1] != 'E') {// + 和 -必须在第一个或者e的后面
                    return false;
                }
            } else {
                return false;
            }
        }
        return seenNum;
    }
}
