package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:19
 * @description https://leetcode-cn.com/problems/string-matching-in-an-array/
 */
public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(j == i) continue;
                if(words[j].contains(words[i]) && !ans.contains(words[i])){
                    ans.add(words[i]);
                    continue;
                }
            }
        }
        return ans;
    }
}
