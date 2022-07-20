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
 * @return {TreeNode}
 */
var invertTree = function(root) {
    if(!root) return null
    let res = root
    let q = [root]
    while(q.length!==0){
        let n = q.length
        for(let i=0;i<n;i++){
            let curr = q.shift()
            if(curr.left) q.push(curr.left)
            if(curr.right) q.push(curr.right)
                let temp = curr.left
                curr.left = curr.right
                curr.right = temp
            
        }
    }
    return res
};