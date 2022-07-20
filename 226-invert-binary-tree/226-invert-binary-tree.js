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
 * @return {TreeNode}
 */
let helper = (root) => {
    if(!root) return null;
    let temp = root.left
    root.left = root.right
    root.right = temp
    if(root.left) helper(root.left)
    if(root.right) helper(root.right)
    return root
} 
var invertTree = function(root) {
    return helper(root)
};