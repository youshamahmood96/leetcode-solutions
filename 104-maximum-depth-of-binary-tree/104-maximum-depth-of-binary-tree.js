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
var dfs = function(root){
    if(!root) return 0;
    let left = dfs(root.left)
    let right = dfs(root.right)
    return Math.max(left+1,right+1)
}
var maxDepth = function(root) {
    return dfs(root)
};