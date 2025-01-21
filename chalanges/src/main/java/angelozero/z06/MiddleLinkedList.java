package angelozero.z06;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {

    private static final List<ListNode> VALUES = new ArrayList<>();

    public static void main(String[] args) {

        var l6 = new ListNode(1, null);
        var l5 = new ListNode(1, l6);
        var l4 = new ListNode(1, l5);
        var l3 = new ListNode(1, l4);
        var l2 = new ListNode(1, l3);
        var l1 = new ListNode(1, l2);

        System.out.println(middleNode(l1));

    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
