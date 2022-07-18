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
 * @return {boolean}
 */
var depth = function(root){
    if(!root) return 0;
    let lh = depth(root.left);
    let rh = depth(root.right);
    if(lh===-1 || rh===-1) return -1
    if(Math.abs(lh-rh)>1) return -1;
    return Math.max(lh,rh)+1;
}
var isBalanced = function(root) {
    let x =  depth(root)
    return x===-1 ? false : true
};