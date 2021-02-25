package insert_interval;

import java.util.LinkedList;

public class trversal {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> ret = new LinkedList<int[]>();
        int i = 0;
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                i++;
                ret.add(interval);
            } else {
                break;
            }
        }
        ret.add(newInterval);
        for (;i<intervals.length;i++) {
            int[] last = ret.getLast();
            if (last[1] < intervals[i][0]) {
                ret.addLast(intervals[i]);
            } else {
                last[0] = Math.min(last[0],intervals[i][0]);
                last[1] = Math.max(last[1],intervals[i][1]);
                ret.removeLast();
                ret.addLast(last);

            }
        }
        return ret.toArray(new int[ret.size()][2]);
    }

    public static void main(String[] args) {
        int[][] data = {{1,3},{6,9}};
        int[] interval = {2,5};
        trversal example = new trversal();
        int[][] ret = example.insert(data,interval);
        for (int i=0;i<ret.length;i++) {
            System.out.println(Integer.toString(ret[i][0]) + "," + ret[i][1]);
        }

    }
}
