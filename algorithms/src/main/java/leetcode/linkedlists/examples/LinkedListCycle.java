package leetcode.linkedlists.examples;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}

// !!!ONLY FOR DEMONSTRATION CONCEPT!!!
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
