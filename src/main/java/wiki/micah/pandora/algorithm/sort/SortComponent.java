package wiki.micah.pandora.algorithm.sort;

import java.util.Arrays;

/**
 * 排序算法集合
 *
 * @author micah
 * @version 0.0.1
 * @since 2020-07-09
 */
public class SortComponent {
    /**
     * 冒泡算法排序
     *
     * @param arrays 冒泡数组
     */
    public static void bubble(Integer[] arrays) {
        System.out.println("排序前，数组顺序：" + Arrays.toString(arrays));
        System.out.println("排序后，数组逆序顺序：" + Arrays.toString(bubble0(arrays)));
        System.out.println("排序后，数组正序顺序：" + Arrays.toString(bubble1(arrays)));
    }

    /**
     * 冒泡算法排序实现，大的在前面
     *
     * @param arrays 数组
     * @return 排序后的数组
     */
    private static Integer[] bubble0(Integer[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1; j < arrays.length - i; j++) {
                if (arrays[j - 1] < arrays[j]) {
                    int temp = arrays[j - 1];
                    arrays[j - 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }

    /**
     * 冒泡算法排序实现，小的在前面
     *
     * @param arrays 数组
     * @return 排序后的数组
     */
    private static Integer[] bubble1(Integer[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1; j < arrays.length - i; j++) {
                if (arrays[j - 1] > arrays[j]) {
                    int temp = arrays[j - 1];
                    arrays[j - 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }


    public static void main(String[] args) {
        bubble(new Integer[]{3, 2, 1, 4, 2, 5, 2, 3, 4});
    }
}
