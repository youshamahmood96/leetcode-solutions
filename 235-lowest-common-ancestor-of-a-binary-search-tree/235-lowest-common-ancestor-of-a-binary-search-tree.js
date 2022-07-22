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
    let res = 0
    let qu = [root]
    while(qu.length>0){
        let curr = qu.shift()
        if(curr.val < p.val && curr.val < q.val){
            qu.push(curr.right)
        }
        else if(curr.val > p.val && curr.val > q.val){
            qu.push(curr.left)
        }
        else{
            res = curr
            break
        }
    }
    return res;
};