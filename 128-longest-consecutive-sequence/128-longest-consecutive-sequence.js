/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    var hash = {};
    var max = 0;
    for (var i = 0; i < nums.length; i++) {
        if (!hash[nums[i]]) {
            hash[nums[i]] = true;
            var left = nums[i] - 1;
            var right = nums[i] + 1;
            while (hash[left]) {
                left--;
            }
            while (hash[right]) {
                right++;
            }
            max = Math.max(max, right - left - 1);
        }
    }
    return max;
}