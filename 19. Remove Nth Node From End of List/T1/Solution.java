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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null){
            return null;
        }
        if (remove(head, n) == n){
            head = head.next;
        };
        return head;
        
    }
    private int remove(ListNode head, int target){
        int num = -1;
        if (head.next == null){
            num = 1;
        }
        else {
            num = remove(head.next, target) + 1;
        }
        if (num == target +1){
            head.next = head.next.next;
        }
        return num;
    }
}
