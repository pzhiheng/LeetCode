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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        else if (list1 == null){
            return list2;
        }
        else if (list2 == null){
            return list1;
        }
        else{
            ListNode head = new ListNode();
            ListNode current = new ListNode();
            if (list1.val > list2.val){
                head = list2;
                current = list2; 
                list2 = list2.next;
            }
            else{
                head = list1;
                current = list1;
                list1 = list1.next;
            }
            while(list1 != null && list2 != null){
                if (list1.val > list2.val){
                    current.next = list2;
                    list2 = list2.next;
                    current = current.next;
                }
                else{
                    current.next = list1;
                    list1 = list1.next;
                    current = current.next;
                }
            }
            if (list1 == null){
                current.next = list2;
            }
            else{
                current.next = list1;
            }
            return head;
        }
        
    }
}
