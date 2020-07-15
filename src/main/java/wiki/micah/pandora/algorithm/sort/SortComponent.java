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
    public static void bubble(int[] arrays) {
        System.out.println("排序前，数组顺序：" + Arrays.toString(arrays));
        System.out.println("排序后，数组逆序顺序：" + Arrays.toString(bubble0(arrays)));
        System.out.println("排序后，数组正序顺序：" + Arrays.toString(bubble1(arrays)));
    }

    public static void merge(int[] arrays) {
        System.out.println("排序前，数组顺序：" + Arrays.toString(arrays));
        System.out.println("排序后，数组顺序：" + Arrays.toString(merge0(arrays, 0, arrays.length - 1)));
    }

    private static int[] merge0(int[] arrays, int low, int high) {
        int mid = (low + high) / 2;
        if (low < mid) {
            merge0(arrays, low, mid);
            merge0(arrays, mid + 1, high);
            merge00(arrays, low, mid, high);
        }
        return arrays;
    }

    private static void merge00(int[] arrays, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = 0;

        int center = mid + 1;

        // 把较小的数先移到新数组中
        while (left <= mid && center <= high) {
            if (arrays[left] < arrays[center]) {
                temp[right++] = arrays[left++];
            } else {
                temp[right++] = arrays[center++];
            }
        }

        // 把左边剩余的数移入数组
        while (left <= mid) {
            temp[right++] = arrays[left++];
        }
        // 把右边边剩余的数移入数组
        while (center <= high) {
            temp[right++] = arrays[center++];
        }
        // 把新数组中的数覆盖nums数组
        if (temp.length >= 0) System.arraycopy(temp, 0, arrays, low, temp.length);
    }

    /**
     * 冒泡算法排序实现，大的在前面
     *
     * @param arrays 数组
     * @return 排序后的数组
     */
    private static int[] bubble0(int[] arrays) {
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
    private static int[] bubble1(int[] arrays) {
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
        //bubble(new int[]{3, 2, 1, 4, 2, 5, 2, 3, 4});
        merge(new int[]{8, 7, 6, 5, 4, 3, 2, 1});
    }
}
