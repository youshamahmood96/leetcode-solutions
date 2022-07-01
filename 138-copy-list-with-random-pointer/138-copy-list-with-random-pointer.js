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
    const map = new Map();
    for(let curr = head;curr;curr = curr.next){
        let newNode = new Node(curr.val)
        map.set(curr,newNode)
    }
    let curr = head
    while(curr){
        let temp = map.get(curr)
        temp.next = curr.next ? map.get(curr.next) : null
        temp.random = curr.random ? map.get(curr.random) : null
        map.set(curr,temp)
        curr = curr.next
    }
    return map.get(head)
};