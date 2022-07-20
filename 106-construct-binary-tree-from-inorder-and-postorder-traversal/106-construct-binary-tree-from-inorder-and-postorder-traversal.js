/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    if(postorder.length ===0 || inorder.length === 0) return null;
    let root = new TreeNode(postorder[postorder.length-1])
    let idx = inorder.findIndex(el=>el===postorder[postorder.length-1])
    root.left = buildTree(inorder.slice(0,idx),postorder.slice(0,idx))
    root.right = buildTree(inorder.slice(idx+1,inorder.length),postorder.slice(idx,postorder.length-1))
    return root
};