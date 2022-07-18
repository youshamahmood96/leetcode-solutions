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
    size(){
        return this.q.size;
    }
    peek(){
        return this.q.get(this.curr)
    }
}
var maxDepth = function(root) {
    if(!root) return 0;
    let count = 0;
    let q = new Q();
    q.in(root);
    while(!q.isEmpty()){
        let n = q.size();
        for(let i=0;i<n;i++){
            if(q.peek().left !== null){
                q.in(q.peek().left)
            } 
            if(q.peek().right !== null){
                q.in(q.peek().right)
            } 
            q.out()
        }
        count++
    }
    return count
};