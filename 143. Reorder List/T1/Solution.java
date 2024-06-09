/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondhalf = reverse(slow.next);
        ListNode thing = secondhalf;
        slow.next = null;
        head = merge(head, secondhalf);
        
    }
    private ListNode reverse (ListNode head){
        ListNode Next = null;
        ListNode current = head;
        ListNode prev = null;
        while (current != null){
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        return prev;
    }
    private ListNode merge(ListNode head1, ListNode head2){
        ListNode head = head1;
        ListNode current = head1;
        head1 = head1.next;
        while(head2 != null && head1 != null){
            current.next = head2;
            current = current.next;
            head2 = head2.next;
            current.next = head1;
            current = current.next;
            head1 = head1.next;
        }
        if (head2 != null){
            current.next = head2;
        }
        return head;

    }
    }
