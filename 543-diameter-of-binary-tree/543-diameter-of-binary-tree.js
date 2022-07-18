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

var diameterOfBinaryTree = function(root) {
    if(!root) return 0
    let max = 0;
    var maxDepth = function(root) {
        if(!root) return 0;
        let lh = maxDepth(root.left)
        let rh = maxDepth(root.right)
        max = Math.max(max,lh+rh)
        return 1+Math.max(lh,rh)
    };
    maxDepth(root)
    return max
};