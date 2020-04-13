package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:31
 * @description https://leetcode-cn.com/problems/deep-dark-fraction/
 */
public class DeepDarkFraction {
    public int[] fraction(int[] cont) {
        //数组中最后一个数必不为0
        //两部分操作：当前数i先取倒数，再加前一个数i-1
        //循环停止条件：前一个数i-1不存在
        //特殊：前一个数为0，直接取倒数
        int n = cont.length;
        int[] ans = {cont[n-1],1};  //结果数组初始化为最后一个数
        for(int i=n-2; i>=0; i--){
            //取倒数
            int temp = ans[1];
            ans[1] = ans[0];
            ans[0] = temp;
            //加前一个数
            ans[0] += cont[i]*ans[1];
        }
        return ans;
    }
}
