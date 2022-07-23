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
    let q = []
    let dfs = (root) => {
        if(!root) return;
        dfs(root.left)
        q.push(root.val)
        dfs(root.right)
        return;
    }
    dfs(root)
    for(let i=1;i<q.length;i++){
        res = Math.min(res,q[i]-q[i-1])
    }
    return res
};