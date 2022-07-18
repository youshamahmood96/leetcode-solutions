/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
class Q{
    constructor(){
        this.q = new Map();
        this.idx = 0;
        this.curr = 0;
    }
    in(value){
        this.q.set(this.idx, value);
        this.idx++;
    }
    out(){
        let curr = this.q.get(this.curr);
        this.q.delete(this.curr);
        this.curr++;
        return curr;
    }
    isEmpty(){
        return this.q.size === 0;
    }
    peek(){
        if(this.q.has(this.curr)){
            return this.q.get(this.curr);
        }
        else{
            return null;
        }
    }
}
var kthSmallest = function(root, k) {
    let q = new Q()
    q.in(root)
    let visited = []
    while(!q.isEmpty()){
        let curr = q.out()
        visited.push(curr.val)
        if(curr.left){
            q.in(curr.left)
        }
        if(curr.right){
            q.in(curr.right)
        }
    }
    visited.sort((a,b)=>a-b)
    return visited[k-1]
};