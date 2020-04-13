package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:31
 * @description https://leetcode-cn.com/problems/living-people-lcci/
 */
public class LivingPeopleLCCI {
    public int maxAliveYear(int[] birth, int[] death) {
        int max = 0;
        int maxyear = 0;
        for (int year = 1900; year <= 2000; year++) {
            int count = 0;
            for (int i = 0; i < birth.length; i++) {
                if (birth[i] <= year && year <= death[i]) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    maxyear = year;
                }
            }
        }
        return maxyear;
    }
}
