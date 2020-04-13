package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:21
 * @description https://leetcode-cn.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer s = new StringBuffer(S.toUpperCase().replaceAll("-",""));
        int count = 1;
        for(int i= s.length()-1; i>=0; i--,count++){
            if(count == K && i!=0){
                s.insert(i,'-');
                count = 0;
            }

        }
        return s.toString();
    }
}
