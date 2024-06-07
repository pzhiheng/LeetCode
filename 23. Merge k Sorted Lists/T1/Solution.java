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
    public ListNode mergeKLists(ListNode[] lists) {
        int [] array = toArray(lists);
        if (array.length == 0){
            return null;
        }
        Arrays.sort(array);
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1 ; i < array.length ; i ++){
            ListNode dummy = new ListNode(array[i]);
            current.next = dummy;
            current = current.next;
        }
        return head;


        
    }
    private int [] toArray(ListNode[] lists){
        if (lists.length == 0){
            return new int [0];
        }
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0 ; i < lists.length ; i ++){
            ListNode current = new ListNode();
            current = lists[i];
            while (current != null){
                arraylist.add(current.val);
                current = current.next;
            }
        }
        int[] array = new int[arraylist.size()];
        for (int i = 0 ; i < array.length ; i ++){
            array[i] = arraylist.get(i);
        }
        return array;
    }
}
