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
var goodNodes = function(root) {
    let res = 0
    let dfs = (root,max) => {
        if(!root) return;
        console.log(root.val,max)
        if(root.val>=max) res++
        if(root.left) dfs(root.left,Math.max(root.val,max))
        if(root.right) dfs(root.right,Math.max(root.val,max))
    }
    dfs(root,root.val)
    return res;
};