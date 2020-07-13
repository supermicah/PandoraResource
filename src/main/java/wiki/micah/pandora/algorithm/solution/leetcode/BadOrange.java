package wiki.micah.pandora.algorithm.solution.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/rotting-oranges/">力扣为算法994题</a>
 *
 * @author micah
 * @version 0.0.1
 * @since 2020-07-11
 */
@SuppressWarnings("unused")
public class BadOrange {

    public static void main(String[] args) {
        // 全部感染，结果是4
        int[][] grid = new int[3][3];
        grid[0] = new int[]{2, 1, 1};
        grid[1] = new int[]{1, 1, 0};
        grid[2] = new int[]{0, 1, 1};

        // 有新鲜橘子没有被感染，-1
//        int[][] grid = new int[3][3];
//        grid[0] = new int[]{2,1,1};
//        grid[1] = new int[]{0,1,1};
//        grid[2] = new int[]{1,0,1};

        // 没有新鲜橘子的情况，0
//        int[][] grid = new int[2][2];
//        grid[0] = new int[]{0, 2};


        System.out.println(breadthFirstSearch(grid));
    }

    /**
     * Breadth-First-Search，宽度优先搜索
     *
     * @param grid 网格
     * @return 返回深度
     */
    private static int breadthFirstSearch(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int height = grid.length;
        int width = grid[0].length;

        Queue<Integer> queue = new LinkedList<>();
        int newOrangeCount = 0;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (grid[h][w] == 2) {
                    queue.offer(h * width + w);
                } else if (grid[h][w] == 1) {
                    newOrangeCount++;
                }
            }
        }

        int loopTimes = 0;
        int times = 0;
        // 循环坏橘子
        while (!queue.isEmpty() && newOrangeCount > 0) {
            // 一层一层的传染，每传染一层，时间+1
            loopTimes++;
            int badOrangeCount = queue.size();
            for (int index = 0; index < badOrangeCount; index++) {
                times++;
                Integer number = queue.poll();
                if (number == null) {
                    break;
                }

                // 获取坏橘子的行和列
                int line = number / width;
                int col = number % width;

                // 上
                if (line - 1 >= 0 && grid[line - 1][col] == 1) {
                    // 把新橘子变成坏橘子
                    queue.offer((line - 1) * width + col);
                    grid[line - 1][col] = 2;
                    newOrangeCount--;
                }
                // 下
                if (line + 1 < height && grid[line + 1][col] == 1) {
                    // 把新橘子变成坏橘子
                    queue.offer((line + 1) * width + col);
                    grid[line + 1][col] = 2;
                    newOrangeCount--;
                }
                // 左
                if (col - 1 >= 0 && grid[line][col - 1] == 1) {
                    // 把新橘子变成坏橘子
                    queue.offer(line * width + col - 1);
                    grid[line][col - 1] = 2;
                    newOrangeCount--;
                }
                // 左
                if (col + 1 < width && grid[line][col + 1] == 1) {
                    // 把新橘子变成坏橘子
                    queue.offer(line * width + col + 1);
                    grid[line][col + 1] = 2;
                    newOrangeCount--;
                }
            }
        }
        System.out.println(times);
        return newOrangeCount == 0 ? loopTimes : -1;
    }


    /**
     * Depth-first search，深度优先搜索;
     *
     * @param grid 网格
     * @return 深度
     */
    public int dfs(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        for (int line = 0; line < grid.length; line++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[line][col] == 2) {
                    dfs0(line, col, 2, grid); // 开始传染
                }
            }
        }

        // 经过dfs后，grid数组中记录了每个橘子被传染时的路径长度，找出最大的长度即为腐烂全部橘子所用的时间。
        int maxLevel = 0;
        for (int[] line : grid) {
            for (int col = 0; col < line.length; col++) {
                if (line[col] == 1) {
                    // 若有新鲜橘子未被传染到，直接返回-1
                    return -1;
                } else {
                    maxLevel = Math.max(maxLevel, line[col]);
                }
            }
        }

        return maxLevel == 0 ? 0 : maxLevel - 2;
    }

    // level用来记录传染路径的长度（当然最后要减2）
    private void dfs0(int i, int j, int level, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        // 只有新鲜橘子或者传播路径比当前路径长的橘子，才继续进行传播。
        if (grid[i][j] != 1 && grid[i][j] < level) {
            return;
        }
        // 将传染路径的长度存到grid[i][j]中
        grid[i][j] = level;
        level++;
        dfs0(i - 1, j, level, grid);
        dfs0(i + 1, j, level, grid);
        dfs0(i, j - 1, level, grid);
        dfs0(i, j + 1, level, grid);
    }
}
