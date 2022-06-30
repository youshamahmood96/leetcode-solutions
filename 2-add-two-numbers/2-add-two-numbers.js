/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
 var addTwoNumbers = function(l1, l2) {
    let curr = l1.val + l2.val;
    let res = new ListNode(curr%10)
    let head = res
    let carry = Math.floor((curr)/10);
    l1 = l1.next
    l2 = l2.next
    while(l1 && l2){
        let curr = l1.val + l2.val;
        res.next = new ListNode((curr+carry)%10)
        carry = Math.floor((curr+carry)/10);
        res = res.next
        l1 = l1.next
        l2 = l2.next
    }
    if(l1){
        while(l1){
            let curr = l1.val + 0;
            res.next = new ListNode((curr+carry)%10)
            carry = Math.floor((curr+carry)/10);
            res = res.next
            l1 = l1.next
        }
    }
    else{
        while(l2){
            let curr = l2.val + 0;
            res.next = new ListNode((curr+carry)%10)
            carry = Math.floor((curr+carry)/10);
            res = res.next
            l2 = l2.next
        }
        
    }
    if(carry!==0){
        res.next = new ListNode(carry)
    }
    return head
};