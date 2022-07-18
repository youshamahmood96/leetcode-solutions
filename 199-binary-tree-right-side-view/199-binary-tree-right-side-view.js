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
 * @return {number[]}
 */
var rightSideView = function(root) {
    if(!root) return []
    let q = [root]
    let res = []
    while(q.length>0){
        let arr = []
        let n = q.length
        for(let i=0;i<n;i++){
            let curr = q.shift()
            arr.push(curr.val)
            if(curr.left) q.push(curr.left)
            if(curr.right) q.push(curr.right)
        }
        res.push(arr[arr.length-1])
    }
    return res
};