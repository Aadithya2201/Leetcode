import java.util.*;
class Solution {
    public int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        List<Integer> res = new ArrayList<>();
        while (!list.isEmpty()) {
            int A = Collections.min(list);
            list.remove(Integer.valueOf(A));
            int B = Collections.min(list);
            list.remove(Integer.valueOf(B));
            res.add(B);
            res.add(A);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
