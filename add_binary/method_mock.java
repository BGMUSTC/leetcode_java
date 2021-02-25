package add_binary;

public class method_mock {
    public String addBinary(String a, String b) {
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while (indexA >= 0 && indexB >= 0) {
            int tmp = 0;
            if (a.charAt(indexA--) == '1') {
                tmp++;
            }
            if (b.charAt(indexB--) == '1') {
                tmp++;
            }
            if (c == 1) {
                tmp++;
            }
            switch (tmp) {
                case 0 :
                    c = 0;
                    sb.append(0);
                    break;
                case 1 :
                    c = 0;
                    sb.append(1);
                    break;
                case 2:
                    c = 1;
                    sb.append(0);
                    break;
                case 3:
                    c = 1;
                    sb.append(1);
            }
        }
        if (indexA >= 0) {
            while (indexA >= 0) {
                if (a.charAt(indexA) == '1' && c == 1) {
                    sb.append(0);
                    c = 1;
                } else {
                    sb.append(a.charAt(indexA) - '0' + c);
                    c = 0;
                    while (--indexA >= 0) {
                        sb.append(a.charAt(indexA) - '0');
                    }
                }
                indexA--;
            }
        } else if (indexB >= 0) {
            while (indexB >= 0) {
                if (b.charAt(indexB) == '1' && c == 1) {
                    sb.append(0);
                    c = 1;
                } else {
                    sb.append(b.charAt(indexB) - '0' + c);
                    c = 0;
                    while (--indexB >= 0) {
                        sb.append(b.charAt(indexB) - '0');
                    }
                }
                indexB--;
            }
        }
        if (c == 1) {
            sb.append(1);
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        method_mock example = new method_mock();
        System.out.println(example.addBinary("111","1"));
    }
}
