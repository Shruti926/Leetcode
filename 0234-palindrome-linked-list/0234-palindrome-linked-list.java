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
    public boolean isPalindrome(ListNode head) {
        // reach th emiddle 
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reversing from middle
        ListNode prev = null;
        ListNode curr= slow;
        ListNode forw = slow;
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
         
        // checking if it is palindrome 
        while(prev != null)
        {
            if(head.val != prev.val)
            {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}