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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        Stack<Integer> inp1 = new Stack<>();
        Stack<Integer> inp2 = new Stack<>();
        int carry = 0;

        // Push all values from l1 into inp1
        while (l1 != null) {
            inp1.push(l1.val);
            l1 = l1.next;
        }

        // Push all values from l2 into inp2
        while (l2 != null) {
            inp2.push(l2.val);
            l2 = l2.next;
        }

        // Process stacks to add numbers
        while (!inp1.isEmpty() || !inp2.isEmpty() || carry != 0) {
            int val1 = !inp1.isEmpty() ? inp1.pop() : 0;
            int val2 = !inp2.isEmpty() ? inp2.pop() : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            // Append new node to the result list
            ListNode newNode = new ListNode(digit);
            newNode.next = tail.next;
            tail.next = newNode;
        }

        return dummy.next;
    }
}