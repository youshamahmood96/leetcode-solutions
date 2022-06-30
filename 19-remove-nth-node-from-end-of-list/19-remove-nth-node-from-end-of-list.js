/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    if(!head.next) return null
    let len = 0;
    let i = 0;
    for(let curr = head;curr;curr = curr.next){
        len++
    }
    i = len-n
    let j = 1;
    let curr = head
    if(i===0){
        curr = curr.next
        return curr
    }
    while(curr){
        if(i===j){
            curr.next = curr.next.next
            break
        }
        curr = curr.next
        j++
    }
    return head
};