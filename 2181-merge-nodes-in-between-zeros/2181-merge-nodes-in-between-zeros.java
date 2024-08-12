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
    public ListNode mergeNodes(ListNode head) {
        ListNode Newhead = new ListNode(0);
        ListNode dummy = Newhead;
        ListNode num = head;
        while(num!=null){
            int sum = 0;
            num = num.next;
            while(num!=null && num.val!=0){
                sum += num.val;
                num = num.next;
            }
            if(sum!=0){
                dummy.next = new ListNode(sum);
                dummy =dummy.next;
            }
        }

        return Newhead.next;
    }
}