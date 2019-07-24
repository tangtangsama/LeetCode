package easyGo;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 12:01
 * @description https://leetcode-cn.com/problems/longest-common-prefix/
 */

/*
    ��ʼ�������Ϊ��һ���ַ�����������������������ַ������бȽϣ��ҳ����߼�������ǰ׺�������������Ϊ�µĽ������
    �ȽϹ�������������Ϊ��ֱ�ӽ�����˵�������ڹ����ǰ׺��
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String s = strs[0];
        for(int i=0; i<strs.length; i++){
            int j=0;
            for(;j<s.length()&&j<strs[i].length();j++){
                if(s.charAt(j) != strs[i].charAt(j))
                    break;
            }
            s=s.substring(0,j);
            if(s.equals(""))
                return s;
        }
        return s;
    }
}
