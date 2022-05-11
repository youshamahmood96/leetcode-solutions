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
        ListNode res = new ListNode();
        res.val = -1;
        ListNode curr = res;
        while(list1!=null || list2!=null){
            if(list1==null){
                while(list2!=null){
                    curr.next = list2;
                    curr = curr.next;
                    list2 = list2.next;
                }
                break;
            }
            if(list2==null){
                while(list1!=null){
                    curr.next = list1;
                    curr = curr.next;
                    list1 = list1.next;
                }
                break;
            }
            int x = list1.val;
            int y = list2.val;
            if(x<y){
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        return res.next;
    }
}