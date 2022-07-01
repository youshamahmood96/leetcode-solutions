/**
 * // Definition for a Node.
 * function Node(val, next, random) {
 *    this.val = val;
 *    this.next = next;
 *    this.random = random;
 * };
 */

/**
 * @param {Node} head
 * @return {Node}
 */
var copyRandomList = function(head) {
    let map = new Map()
    let curr = head
    while(curr){
        let newNode = new Node(curr.val)
        map.set(curr,newNode)
        curr = curr.next
    }
    curr = head
    while(curr){
        let temp = map.get(curr)
        let next = curr.next ? map.get(curr.next) : null
        let random = curr.random ? map.get(curr.random) : null
        temp.next = next
        temp.random = random
        map.set(curr,temp)
        curr = curr.next
    }
    return map.get(head)
};