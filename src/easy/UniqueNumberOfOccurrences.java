package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:25
 * @description https://leetcode-cn.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        /*
            使用map统计次数，使用set判断是否有重复次数出现
        */
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (int data : arr) {
            if (countMap.get(data) == null) {
                countMap.put(data, 1);
            } else {
                countMap.put(data, countMap.get(data) + 1);
            }
        }
        for (Integer i : countMap.values()) {
            if (!set.add(i)) return false;
        }
        return true;
    }
}
