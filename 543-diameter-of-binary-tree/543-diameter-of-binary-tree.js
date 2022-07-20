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
    let max = 0
    let dfs = (root) => {
        if(!root) return 0
        let lh = dfs(root.left)
        let rh = dfs(root.right)
        let dia = lh+rh
        max = Math.max(max,dia)
        return Math.max(lh,rh)+1
    }
    dfs(root)
    return max
};