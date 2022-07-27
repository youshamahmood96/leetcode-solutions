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
 * @return {void} Do not return anything, modify root in-place instead.
 */
var flatten = function(root) {
    let prev = null
    let dfs = (root) => {
        if(!root) return
        dfs(root.right)
        dfs(root.left)
        root.left = null
        root.right = prev
        prev = root
    }
    dfs(root)
};