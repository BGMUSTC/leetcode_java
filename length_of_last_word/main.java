package length_of_last_word;

public class main {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        boolean flag = false;
        for (int i=len-1;i >= 0;i--) {
            if (flag && s.charAt(i) == ' ') {
                break;
            }
            if (s.charAt(i) != ' ') {
                count++;
                flag = true;
            }
        }
        return count;
    }
}
