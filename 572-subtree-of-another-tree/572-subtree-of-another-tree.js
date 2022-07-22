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
    if((!p || !q ) || (p.val!==q.val)) return false;
    let l = isSameTree(p.left,q.left)
    let r = isSameTree(p.right,q.right)
    return l && r
};
var isSubtree = function(root, subRoot) {
    let q = [root]
    while(q.length>0){
        let curr = q.shift()
        if(isSameTree(curr,subRoot)) return true;
        if(curr.left) q.push(curr.left)
        if(curr.right) q.push(curr.right)
    }
    return false;
};