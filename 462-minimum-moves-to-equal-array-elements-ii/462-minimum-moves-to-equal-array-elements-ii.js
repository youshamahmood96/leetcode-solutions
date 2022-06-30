/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves2 = function(nums) {
    nums.sort((a,b)=>a-b)
    let avg = nums[Math.floor(nums.length/2)]
    let ans = 0
    for(let i=0;i<nums.length;i++){
        ans+= Math.abs(nums[i]-avg)
    }
    return ans
};