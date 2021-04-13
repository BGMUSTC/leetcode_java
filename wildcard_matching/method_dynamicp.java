package wildcard_matching;

/**
 * dp[0][0] = true 代表空字符串默认匹配成功
 * pattern当前字符为？时dp[i][j] = dp[i-1][j-1]
 * pattern当前字符为*时dp[i][j] = dp[i-1][j]|dp[i][j-1]
 * 其他但个字符匹配成功的情况：dp[i][j] = dp[i-1][j-1]
 */
public class method_dynamicp {
    public boolean isMatch(String s, String p) {
        int lenS = s.length();
        int lenP = p.length();
        boolean[][] dp = new boolean[lenS + 1][lenP + 1];
        dp[0][0] = true;
        // 处理匹配串以若干个*开头的情况
        for (int i=1;i<=lenP;i++) {
            if (p.charAt(i - 1) != '*') {
                break;
            }
            dp[0][i] = true;
        }
        for (int i=1;i<=lenS;i++) {
            for (int j=1;j<=lenP;j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        return dp[lenS][lenP];
    }

    public static void main(String[] args) {
        method_dynamicp example = new method_dynamicp();
        String s = "adceb";
        String p = "*a*b";
        System.out.println(example.isMatch(s,p));
    }
}
