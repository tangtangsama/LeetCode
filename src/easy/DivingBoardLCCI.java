package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:23
 * @description https://leetcode-cn.com/problems/diving-board-lcci/
 */
public class DivingBoardLCCI {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k==0) return new int[0];
        if(shorter==longer){
            int[] ans = new int[1];
            ans[0] = k*shorter;
            return ans;
        }
        int[] ans = new int[k+1];
        for(int i=0; i<k+1; i++)
            ans[i] = (k*shorter+(longer-shorter)*i);
        return ans;
    }
}
