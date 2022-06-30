/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    if(!head) return null
    if(!head.next) return head
    let currH = head.next;
    let temp = currH.next;
    head.next = null;
    currH.next = head;
    while(temp){
        let curr = temp.next;
        temp.next = currH;
        currH = temp;
        temp = curr;
    }
    return currH
};