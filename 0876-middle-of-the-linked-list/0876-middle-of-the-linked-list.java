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
    public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            len++;
        }
        int mid=0;
        if(len%2==0){
            mid=len/2;
        }else{
            mid=((len)/2);
        }
        ListNode temp=head;
        ListNode ans=new ListNode(0);
        ListNode aaaan=ans;
        int count=0;
        while(temp!=null){
            ListNode tm=temp;
            if(count>=mid){
                ans.next=tm;
                ans= tm;
            }
            temp=temp.next;
            count++;
        }
        return aaaan.next;
    }
}