package cn.az.code.may;

/**
 * @author az
 * @date 2020/5/10
 */
public class CheckStraightLine {

    /**
     * (y - y1) / (x - x1) = (y1 - y0) / (x1 - x0)
     * @param coordinates co
     * @return straight
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if (len == 2) {
            return true;
        }
        int x0 = coordinates[0][0], y0 = coordinates[0][1],
                x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1)) {
                return false;
            }
        }
        return true;
    }
}
