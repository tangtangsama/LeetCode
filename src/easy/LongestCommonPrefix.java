package easy;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 12:01
 * @description https://leetcode-cn.com/problems/longest-common-prefix/
 */

/*
     初始化结果串为第一个字符串，将结果串依次与后面的字符串进行比较，找出两者间的最长公共前缀，并将结果更新为新的结果串。
    比较过程中如果结果串为空直接结束，说明不存在公共最长前缀。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        String s = strs[0];
        for(int i=0; i<strs.length; i++){
            int j=0;
            for(;j<s.length()&&j<strs[i].length();j++){
                if(s.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            s=s.substring(0,j);
            if("".equals(s)) {
                return s;
            }
        }
        return s;
    }
}
