package permutations_ii;

import java.util.*;

public class method_dfsWithCatbranch {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);

        dfs(0,used,path,nums,res);
        return res;
    }

    private void dfs(int depth, boolean[] used, Deque<Integer> path, int[] nums, List<List<Integer>> res) {
        if (depth == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i< nums.length;i++) {
            if (used[i]) {
                continue;
            }

            if (i > 0 && !used[i-1] && nums[i] == nums[i-1]) {
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;
            dfs(depth + 1,used,path,nums,res);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        method_dfsWithCatbranch example = new method_dfsWithCatbranch();
        List<List<Integer>> res = new ArrayList<>();
        res = example.permuteUnique(nums);
        for (int i=0;i<res.size();i++) {
            for (int j=0;j< nums.length;j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }
    }
}
