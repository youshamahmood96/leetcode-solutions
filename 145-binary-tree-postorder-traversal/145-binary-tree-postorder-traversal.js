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
 * @return {number[]}
 */
var postorderTraversal = function(root) {
   let res = []
   const traverse = (root) => {
       if(!root) return null
       if(root.left) traverse(root.left)
       if(root.right) traverse(root.right)
       res.push(root.val)
   }
   traverse(root)
   return res
};