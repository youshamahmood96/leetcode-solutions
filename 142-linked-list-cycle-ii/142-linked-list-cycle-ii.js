/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    if(!head) return null
    if(!head.next) return null
    let slow = head,fast = head
    do{
        slow = slow.next
        fast = fast.next.next
    }while((fast && fast.next) && (slow!==fast))
    if(slow!==fast) return null
    slow = head
    while(slow!==fast){
        slow = slow.next
        fast = fast.next
    }
    return fast
};