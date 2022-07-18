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
 * @param {TreeNode} subRoot
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    if(!p && !q) return true
    if(!p || !q || p.val !== q.val) return false
    return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
};
var isSubtree = function(root, subRoot) {
    let dfs = (root) => {
        if(!root) return false
        if(isSameTree(root,subRoot)) return true
        return dfs(root.left) || dfs(root.right)
    }
    return dfs(root)
};