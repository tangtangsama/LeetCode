package easy;

/**
 * @author sucre
 * @date 2019-07-22
 * @time 15:30
 * @description https://leetcode-cn.com/problems/largest-perimeter-triangle/
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] A = {3,6,2,3};
        System.out.println("==="+largestPerimeter(A));
    }

    public static int largestPerimeter(int[] A) {

        sort(A);
        for (int t = A.length-3;t>=0;t--)
        {
            if (A[t] + A[t+1] > A[t+2]) {
                return A[t]+A[t+1]+A[t+2];
            }
        }
        return 0;
    }

    public static void  sort(int[] A){
        int temp;

        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(A[j] < A[j-1]){
                    temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }else{         //����Ҫ����
                    break;
                }
            }
        }
    }
}
