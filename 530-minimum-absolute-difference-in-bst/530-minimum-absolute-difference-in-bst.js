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
var getMinimumDifference = function(root) {
    let res = Infinity
    let prev = null;
    let dfs = (root) => {
        if(!root) return;
        dfs(root.left)
        if(prev!==null){
            res = Math.min(res,root.val-prev.val)
        }
        prev = root
        dfs(root.right)
        return;
    }
    dfs(root)
    return res
};