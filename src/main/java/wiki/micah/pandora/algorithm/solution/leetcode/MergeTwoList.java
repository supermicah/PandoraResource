package wiki.micah.pandora.algorithm.solution.leetcode;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-15
 */
public class MergeTwoList {
    public static void main(String[] args) {

        ListNode first = new ListNode(0);
        ListNode number1 = new ListNode(1);
        ListNode number3 = new ListNode(3);
        ListNode number5 = new ListNode(5);
        ListNode number7 = new ListNode(7);
        first.next = number1;
        number1.next = number3;
        number3.next = number5;
        number5.next = number7;

        ListNode second = new ListNode(-1);
        ListNode number2 = new ListNode(2);
        ListNode number4 = new ListNode(4);
        ListNode number6 = new ListNode(6);
        ListNode number8 = new ListNode(8);
        second.next = number2;
        number2.next = number4;
        number4.next = number6;
        number6.next = number8;
        ListNode result = mergeTwoList1(first, second);
        while (true) {
            if (result != null) {
                System.out.println("list number：" + result.value);
                result = result.next;
            } else {
                break;
            }

        }

         result = mergeTwoList2(first, second);
        while (true) {
            if (result != null) {
                System.out.println("list number：" + result.value);
                result = result.next;
            } else {
                break;
            }

        }

    }

    private static ListNode mergeTwoList2(ListNode first, ListNode second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.value < second.value) {
            return merge2(first, second);
        } else {
            return merge2(second, first);
        }

    }

    private static ListNode merge2(ListNode first, ListNode second) {
        ListNode head = first;
        while (second != null) {
            if (first.next == null) {
                first.next = second; // 这里要注意 直接接到另一个链表的当前表头即可
                break;
            } else {
                if (first.next.value >= second.value) {
                    ListNode temp = new ListNode(second.value);
                    second = second.next;
                    temp.next = first.next;
                    first.next = temp;
                }
            }
            first = first.next;
        }

        return head;
    }

    private static ListNode mergeTwoList1(ListNode first, ListNode second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.value < second.value) {
            return merge1(first, second);
        } else {
            return merge1(second, first);
        }

    }

    private static ListNode merge1(ListNode first, ListNode second) {
        ListNode head = new ListNode(first.value);
        ListNode temp = head;
        first = first.next;
        while (true) {
            if (first == null && second == null) {
                break;
            } else if (first == null) {
                temp.next = second;
                break;
            } else if (second == null) {
                temp.next = first;
                break;
            } else {
                if (first.value <= second.value) {
                    temp.next = new ListNode(first.value);
                    temp = temp.next;
                    first = first.next;
                } else {
                    temp.next = new ListNode(second.value);
                    temp = temp.next;
                    second = second.next;
                }
            }
        }
        return head;
    }

    static class ListNode {
        public ListNode(int value) {
            this.value = value;
        }

        ListNode next;
        Integer value;

        @Override
        public String toString() {
            return "ListNode{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }
    }
}
