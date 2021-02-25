package minimum_window_substring;

public class ascii_method {
    public String minWindow(String s, String t) {
        int lenS = s.length(), lenT = t.length();
        if (lenS == 0 || lenT == 0) {
            return "";
        }
        int[] need = new int[128];
        for (int i = 0; i < lenT; i++) {
            need[t.charAt(i)]++;
        }
        int left = 0, right = 0, size = Integer.MAX_VALUE, count = lenT, start = 0;
        while (right < lenS) {
            char c = s.charAt(right);
            if (need[c] > 0) {
                count--;
            }
            need[c]--;
            if (count == 0) {
                while (left < right && need[s.charAt(left)] < 0) {
                    need[s.charAt(left)]++;
                    left++;
                }
                if (right - left + 1 < size) {
                    size = right - left + 1;
                    start = left;
                }
                need[s.charAt(left)]++;
                left++;
                count++;
            }
            right++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, size + start);
    }

    public static void main(String[] args) {
        ascii_method example = new ascii_method();
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(example.minWindow(s,t));
    }
}
