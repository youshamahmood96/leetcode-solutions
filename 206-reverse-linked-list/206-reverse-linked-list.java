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
    public ListNode reverseList(ListNode head) {
         if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode currH = head.next;
        ListNode curr = currH.next;
        head.next = null;
        currH.next = head;
        while(curr!=null){
            ListNode t = curr.next;
            ListNode x = currH;
            currH = curr;
            currH.next = x;
            curr = t;
        }
        return currH;
    }
}