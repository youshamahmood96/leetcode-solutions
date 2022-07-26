/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    let res = null;
    let dfs = root => {
        if(!root) return;
        if(root.val<p.val && root.val<q.val) dfs(root.right)
        else if(root.val>p.val && root.val>q.val) dfs(root.left)
        else{
            res = root
            dfs(null)
        }
        return;
    }
    dfs(root)
    return res
};