package simplify_path;

import java.util.LinkedList;

public class method_mock {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (String ss : s) {
            if ("..".equals(ss)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (!"".equals(ss) && !".".equals(ss)) {
                stack.addLast(ss);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<stack.size();i++) {
            sb.append("/" + stack.get(i));
        }
        return sb.toString();
    }
}
