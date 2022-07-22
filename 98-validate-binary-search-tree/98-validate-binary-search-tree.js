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
    let dfs = (root,min,max) => {
        if(!root) return true;
        if(root.val <= min || root.val >=max) return false
        let lh = dfs(root.left,min,root.val)
        let rh = dfs(root.right,root.val,max)
        return lh && rh
    }
    return dfs(root,-Infinity,Infinity)
};