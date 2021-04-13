package text_justification;

import java.util.LinkedList;
import java.util.List;

public class method_mock {
    public List<String> fullJustify(String[] words, int maxWidth) {
        LinkedList<String> res = new LinkedList<>();
        int cnt = 0;
        int bg = 0;
        for (int i=0;i<words.length;i++) {
            cnt += words[i].length() + 1;

            if (i + 1 == words.length || cnt + words[i+1].length() > maxWidth) {
                res.addLast(fillWords(words,bg,i,maxWidth,i + 1 == words.length));
                bg = i + 1;
                cnt = 0;
            }
        }
        return res;
    }

    private String fillWords(String[] words, int bg, int ed, int maxWidth, boolean lastLine) {
        int wordCount = ed - bg + 1;
        int spaceCount = maxWidth + 1 - wordCount;
        for (int i=bg;i<=ed;i++) {
            spaceCount -= words[i].length();
        }
        int spaceSuffix = 1;
        int spaceAvg = (wordCount == 1) ? 1 : spaceCount / (wordCount - 1);
        int spaceExtra = (wordCount == 1) ? 0 : spaceCount % (wordCount - 1);

        String res = "";
        for (int i=bg;i<ed;i++) {
            res += words[i];
            if (lastLine) {
                res += " ";
                continue;
            }
            int tmpTrim = spaceSuffix + spaceAvg + ((i - bg) < spaceExtra ? 1 : 0);
            for (int j=0;j<tmpTrim;j++) {
                res += " ";
            }
        }
        res += words[ed];
        int lastTrim = maxWidth - res.length();
        for (int j=0;j<lastTrim;j++) {
            res += " ";
        }
        return res;
    }
}
