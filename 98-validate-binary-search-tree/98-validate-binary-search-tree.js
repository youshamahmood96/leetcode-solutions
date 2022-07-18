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
 * @return {boolean}
 */
var isValidBST = function(root) {
    let dfs = (node,min,max) => {
        if(!node) return true
        if(node.val<=min || node.val>=max) return false
        let left =  dfs(node.left,min,node.val)
        let right = dfs(node.right,node.val,max)
        return left && right
    }
    return dfs(root,-Infinity,Infinity)
};