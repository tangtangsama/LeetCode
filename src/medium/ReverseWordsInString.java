package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:32
 * @description https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {

        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
