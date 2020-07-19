package wiki.micah.pandora.algorithm.solution.leetcode.bean;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-17
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int data) {
        this.val = data;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + val +
                '}';
    }
}
