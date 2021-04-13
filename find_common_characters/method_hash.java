package find_common_characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class method_hash {
    public List<String> commonChars(String[] A) {
        List<String> ret = new ArrayList<>();
        if (A.length == 0) {
            return null;
        }
        int[] hash = new int[26];
        for (int i=0;i<A[0].length();i++) {
            hash[A[0].charAt(i) - 'a']++;
        }
        int[] otherHash = new int[26];
        for (int i=1;i<A.length;i++) {
            Arrays.fill(otherHash,0);
            for (int j=0;j<A[i].length();j++) {
                otherHash[A[i].charAt(j) - 'a']++;
            }
            for (int j=0;j<26;j++) {
                hash[j] = Math.min(hash[j],otherHash[j]);
            }
        }
        for (int i=0;i<26;i++) {
            while (hash[i] != 0) {
                String s = new String(String.valueOf((char)('a' + i)));
                ret.add(s);
                hash[i]--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        method_hash example = new method_hash();
        String[] strs = {"bella","label","roller"};
        List<String> ret = example.commonChars(strs);
        for (int i=0;i<ret.size();i++) {
            System.out.println(ret.get(i));
        }
    }
}
