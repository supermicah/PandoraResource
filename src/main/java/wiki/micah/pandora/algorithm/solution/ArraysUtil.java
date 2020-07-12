package wiki.micah.pandora.algorithm.solution;

import java.util.Arrays;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-12
 */
public class ArraysUtil {
    public static void main(String[] args) {
//        String[] testArray = {"jslkdfj", "sds", "ss", "dd", "nn", "mm", "nn", "mm"};
        int[] testArray = {3, 5, 4, 6, 7, 4, 3, 2, 6};
        Arrays.stream(testArray).distinct().forEach(System.out::println);
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == -1) {
                continue;
            }
            for (int j = i; j < testArray.length; j++) {

            }

        }

    }
}
