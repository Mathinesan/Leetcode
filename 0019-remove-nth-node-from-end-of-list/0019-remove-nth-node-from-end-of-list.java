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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        ListNode move = dummy;
        for(int i=0;i<n+1;i++){
            move = move.next;
        }
        while(move!=null){
            start = start.next;
            move = move.next;
        }
        start.next = start.next.next;
        return dummy.next;
    }
}