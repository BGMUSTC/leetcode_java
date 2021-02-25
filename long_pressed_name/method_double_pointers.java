package long_pressed_name;

public class method_double_pointers {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            } else if (i == n - 1) {
                for (int k = j;k < m;k++) {
                    if (typed.charAt(k) != name.charAt(i)) {
                        return false;
                    }
                }
                return true;
            } else if (j+1 < m && typed.charAt(j) == typed.charAt(j + 1) && i+1 < n && name.charAt(i) != name.charAt(i+1)) {
                while (j + 1 < m && typed.charAt(j) == typed.charAt(j+1)) {
                    j++;
                }
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        return false;
    }
}

