package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:42
 * @description https://leetcode-cn.com/problems/game-of-life/
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return;

        //dx dy用作下标变换，将当前坐标变为其上下左右和对角位置的坐标
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { //遍历每个点
                int cnt = 0;
                for (int k = 0; k < 8; k++) { //变换坐标，遍历其上下左右和对角的点
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;   //如果周围某个点越界则不作处理
                    if (board[nx][ny] > 0) cnt++;  //如果周围某个点是活细胞，计数加1
                }
                if (board[i][j] > 0) { // 当前点是活细胞
                    if (cnt < 2 || cnt > 3) //根据规则下个状态是死细胞
                        board[i][j] = 2;    //在原坐标上设置为2，下一次讨论改点时，board[nx][ny]=2>0,仍然统计为活细胞
                } else { // 当前点是死细胞
                    if (cnt == 3)   //根据规则下个状态是活细胞
                        board[i][j] = -1;   //在原坐标上设置为-1，下一次讨论改点时，board[nx][ny]=-1<0,仍然统计为死细胞
                }
            }
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == -1)  //-1表示上个状态是死细胞，当前状态转为活细胞
                    board[i][j] = 1;
                else if (board[i][j] == 2)  //2表示上个状态是活细胞，当前状态转为死细胞
                    board[i][j] = 0;
    }
}
