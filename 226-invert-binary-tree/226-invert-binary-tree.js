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
var helper = function(root){
    if(!root) return
    let temp = root.left
    root.left = root.right
    root.right = temp
    helper(root.left)
    helper(root.right)
}
var invertTree = function(root) {
    helper(root)
    return root
};