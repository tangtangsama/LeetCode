package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:30
 * @description https://leetcode-cn.com/problems/queries-on-a-permutation-with-key/
 */
public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> num = new ArrayList<>();
        int[] ans = new int[queries.length];
        for (int i = 0; i < m; i++) {
            num.add(i + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            int index = num.indexOf(queries[i]);
            int tempE = queries[i];
            ans[i] = index;
            num.remove(index);
            num.add(0, tempE);

        }
        return ans;
    }
}
