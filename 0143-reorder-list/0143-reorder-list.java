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
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        int first =0;
        int mid = arr.size()/2;
        int last = arr.size()-1;
        int index =0;
        for(int i=0;i<=arr.size();i++){
            if(first<=mid){
                arr1.add(arr.get(first));
                first++;
            }
            index++;

            if(last>mid){
                arr1.add(arr.get(last));
                last--;
            }
            index++;
        }
        int index1=0;
        while(head!=null){
            head.val=arr1.get(index1);
            head=head.next;
            index1++;
        }  
    }
}