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
var preorderTraversal = function(root) {
      let res = []
   const traverse = (root) => {
       if(!root) return null
              res.push(root.val)

       if(root.left) traverse(root.left)
       if(root.right) traverse(root.right)
   }
   traverse(root)
   return res
};