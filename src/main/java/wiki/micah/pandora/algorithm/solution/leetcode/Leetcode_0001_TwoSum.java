package wiki.micah.pandora.algorithm.solution.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/two-sum/">两数之和</a>
 *
 * @author micah
 * @version 0.0.1
 * @since 2020-07-17
 */
public class Leetcode_0001_TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("orig array: " + Arrays.toString(nums) + ", target: " + target);
        long startTime = System.nanoTime();
        int[] solution0 = solution0(nums, target);
        System.out.println("solution0 search index of array : " + Arrays.toString(solution0) + ", cost: " + (System.nanoTime() - startTime) + " nanoTime");

        startTime = System.nanoTime();
        int[] solution1 = solution1(nums, target);
        System.out.println("solution1 search index of array : " + Arrays.toString(solution1) + ", cost: " + (System.nanoTime() - startTime) + " nanoTime");

    }

    /**
     * 暴力破解，循环两个书，获取两个数之和
     * <p>
     * 48227 ns
     * <p>
     * 执行用时：65 ms, 在所有 Java 提交中击败了38.42%的用户
     * <p>
     * 内存消耗：40 MB, 在所有 Java 提交中击败了5.06%的用户
     *
     */
    public static int[] solution0(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 暴力破解，循环两个书，获取两个数之和
     * <p>
     * 48227 ns
     * <p>
     * 执行用时：3 ms, 在所有 Java 提交中击败了74.67%的用户
     * <p>
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了5.06%的用户
     *
     */
    public static int[] solution1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer temp = map.get(target - nums[i]);

            if (temp != null && temp != i) {
                return new int[]{i, temp};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
