package wiki.micah.pandora.algorithm.solution.leetcode;

import wiki.micah.pandora.algorithm.solution.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 *
 * @author micah
 * @version 0.0.1
 * @since 2020-07-17
 */
public class Leetcode_0002_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode first = new ListNode(2);
        ListNode first2 = new ListNode(4);
        ListNode first3 = new ListNode(3);
        first.next = first2;
        first2.next = first3;

        ListNode second = new ListNode(5);
        ListNode second2 = new ListNode(6);
        ListNode second3 = new ListNode(4);
        second.next = second2;
        second2.next = second3;
        solution0(first, second);

//        System.out.println("orig array: " + Arrays.toString(nums) + ", target: " + target);
//        long startTime = System.nanoTime();
//        int[] solution0 = solution0(nums, target);
//        System.out.println("solution0 search index of array : " + Arrays.toString(solution0) + ", cost: " + (System.nanoTime() - startTime) + " nanoTime");
    }

    /**
     * 暴力破解，循环两个链表，获取两个数之和
     * <p>
     * 48227 ns
     * <p>
     * 执行用时：65 ms, 在所有 Java 提交中击败了38.42%的用户
     * <p>
     * 内存消耗：40 MB, 在所有 Java 提交中击败了5.06%的用户
     */
    public static ListNode solution0(ListNode l1, ListNode l2) {
        return null;

    }

}
