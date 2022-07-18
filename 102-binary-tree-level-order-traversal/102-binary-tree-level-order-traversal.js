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
 * @return {number[][]}
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
        return this.q.size
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
var levelOrder = function(root) {
    if(!root) return []
    let res = []
    let q = []
    q = [root]
    while(q.length>0){
        let n = q.length
        let arr = []
        for(let i=0;i<n;i++){
            let curr = q.shift()
            arr.push(curr.val)
            if(curr.left) q.push(curr.left)
            if(curr.right) q.push(curr.right)
        }
        res.push(arr)
    }
    return res
};