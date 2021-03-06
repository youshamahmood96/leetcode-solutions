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
var zigzagLevelOrder = function(root) {
    if(!root) return [];
    let q = [root]
    let lv = 1
    let res = []
    while(q.length>0){
        let n = q.length
        let temp = []
        for(let i=0;i<n;i++){
            let curr = q.shift()
            if(curr.left) q.push(curr.left)
            if(curr.right) q.push(curr.right)
            if(lv%2===0){
                temp.unshift(curr.val)
            }
            else{
                temp.push(curr.val)
            }
        }
        res.push(temp)
        lv++
    }
    return res
};