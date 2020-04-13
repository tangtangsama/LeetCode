package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:35
 * @description https://leetcode-cn.com/problems/rotate-matrix-lcci/
 */
public class RotateMatrixLCCI {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0; i<len-1; i++){//对角线对称翻转
            for(int j=i+1; j<len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int mid = len/2;
        for(int i=0; i<len; i++){//将矩阵沿中轴线对称翻转
            for(int j=0; j<mid; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = temp;
            }
        }
    }
}
