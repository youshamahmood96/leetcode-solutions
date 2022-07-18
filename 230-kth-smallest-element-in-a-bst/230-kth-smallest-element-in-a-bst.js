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
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {
    let res = 0
   let inOrder = (root) => {
       if(!root) return;
       if(root.left) inOrder(root.left)
       k--
       if(k===0) res = root.val
       if(root.right) inOrder(root.right)
   }
   inOrder(root)
    return res
};