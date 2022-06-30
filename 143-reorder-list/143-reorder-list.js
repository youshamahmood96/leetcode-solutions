/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    let res = []
    for(let curr = head;curr;curr = curr.next){
        res.push(curr)
    }
    let i = 0;
    let j = res.length - 1
    while(i<j){
        res[i].next = res[j]
        i++
        res[j].next = res[i]
        j--
    }
    res[i].next = null
};