package reorganiz_string;

public class stagArray {
    public String reorganizeString(String S) {
        int length = S.length();
        if (length < 3) {
            return S;
        }
        char[] alphabateArr = S.toCharArray();
        int[] alphabateCount = new int[26];
        for (int i = 0; i < length; i++) {
            alphabateCount[alphabateArr[i] - 'a']++;
        }
        int max= 0, alphabate = 0, threshold = (length + 1) >> 1;
        for (int i = 0; i < alphabateCount.length; i++) {
            if (alphabateCount[i] > max) {
                max = alphabateCount[i];
                alphabate = i;
                if (max > threshold) {
                    return "";
                }
            }
        }
        char[] res = new char[length];
        int index = 0;
        while (alphabateCount[alphabate]-- > 0) {
            res[index] = (char)(alphabate + 'a');
            index += 2;
        }
        for (int i = 0; i < alphabateCount.length; i++) {
            while (alphabateCount[i]-- > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char)('a' + i);
                index += 2;
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        stagArray example = new stagArray();
        System.out.println(example.reorganizeString("aab"));
    }
}
