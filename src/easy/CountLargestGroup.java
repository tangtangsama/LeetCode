package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:30
 * @description https://leetcode-cn.com/problems/count-largest-group/
 */
public class CountLargestGroup {
    public int countLargestGroup(int n) {


        int[] count = new int[9*String.valueOf(n).length()+1];

        for(int i=1; i<=n; i++){
            int num = i;
            int temp = 0;
            while(num>0){
                temp += num%10;
                num /= 10;
            }
            count[temp] +=1;
        }
        int maxTime = 0;
        int ans = 0;
        for(int i=1; i<count.length; i++){
            if(count[i]>maxTime){
                // maxPos = i;
                maxTime = count[i];
                ans = 0;

            }else if(count[i]==maxTime){
                ans++;
            }else{
                break;
            }

        }

        return ans+1;
    }
}
