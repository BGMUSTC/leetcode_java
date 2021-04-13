package backspace_string_compare;

import java.util.LinkedList;

public class method_mod {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> sText = new LinkedList<>();
        LinkedList<Character> tText = new LinkedList<>();
        int len1 = S.length();
        int len2 = T.length();
        for (int i=0;i<len1;i++) {
            if (S.charAt(i) == '#') {
                if (!sText.isEmpty()) {
                    sText.removeLast();
                }
            } else {
                sText.addLast(S.charAt(i));
            }
        }
        for (int i=0;i<len2;i++) {
            if (T.charAt(i) == '#') {
                if (!tText.isEmpty()) {
                    tText.removeLast();
                }
            } else {
                tText.addLast(T.charAt(i));
            }
        }
        return sText.equals(tText);
    }
}
