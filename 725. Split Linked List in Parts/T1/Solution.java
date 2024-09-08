/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        if(head == null){
            return new ListNode[k];
        }
        int lengthOfList = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            lengthOfList++;
        }
        int lengthOfEach = lengthOfList / k;
        int extra = lengthOfList % k;
        ListNode[] results = new ListNode[k];
        ListNode nextHead = head;
        current = head;
        System.out.println(lengthOfEach);
        System.out.println(lengthOfList);        
        System.out.println(extra);

        for (int i = 0; i < k; i++) {
            results[i] = nextHead;
            current = nextHead;
            for (int j = 0; j < lengthOfEach - 1; j++) {
                current = current.next;
            }
            if (i < extra && lengthOfEach != 0) {
                current = current.next;
            }
            if (current != null){
            nextHead = current.next;
            current.next = null;}

        }
        return results;

    }
}
