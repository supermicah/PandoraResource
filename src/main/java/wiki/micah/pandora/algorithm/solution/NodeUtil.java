package wiki.micah.pandora.algorithm.solution;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-12
 */
public class NodeUtil {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        Node temp = a1;
        while (true) {
            System.out.println(temp.value);
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }

        Node newHead = reverse(a1);
        temp = newHead;
        while (true) {
            System.out.println(temp.value);
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }

    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
