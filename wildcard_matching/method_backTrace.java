package wildcard_matching;

public class method_backTrace {

//    public boolean isMatch(String s, String p) {
//        return backTrace(s,0,p,0);
//    }
//
//    private boolean backTrace(String s,int indexS, String p,int indexP) {
//        if (indexS == s.length() && indexP == p.length()) {
//            return true;
//        } else if (indexS == s.length() && indexP < p.length()) {
//            return false;
//        }
//
//        if (indexP > 0) {
//            if (p.charAt(indexP - 1) == '*') {
//                if (indexP < p.length() && p.charAt(indexP) == s.charAt(indexS)) {
//                    if (backTrace(s,indexS+1,p,indexP)) {
//                        return true;
//                    } else {
//                        backTrace(s,indexS+1,p,indexP+1)
//                    }
//
//                }
//                if (backTrace(s,indexS + 1,p,indexP)) {
//                    return true;
//                }
//            }
//        }
//    }
}
