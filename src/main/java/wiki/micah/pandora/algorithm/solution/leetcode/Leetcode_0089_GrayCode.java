package wiki.micah.pandora.algorithm.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/gray-code/">格雷编码</a>
 *
 * @author micah
 * @version 0.0.1
 * @since 2020-07-12
 */
public class Leetcode_0089_GrayCode {
    public static void main(String[] args) {
        System.out.println(gray1(3));
        System.out.println(gray1(4));
    }

    private static List<Integer> gray1(int n) {
        List<Integer> gray = new ArrayList<>();
        //初始化 n = 0 的解
        gray.add(0);
        for (int i = 0; i < n; i++) {
            //要加的数
            int add = 1 << i;
            //倒序遍历，并且加上一个值添加到结果中
            for (int j = gray.size() - 1; j >= 0; j--) {
                gray.add(gray.get(j) + add);
            }
        }
        return gray;
    }

    private static List<Integer> gray0(int n) {
        if (n == 1) {
            List<Integer> result = new ArrayList<>(2);
            result.add(0);
            result.add(1);
            return result;
        }
        return null;
    }
}
