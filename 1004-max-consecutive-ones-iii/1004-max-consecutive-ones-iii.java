class Solution {
    public int longestOnes(int[] nums, int k) {
        int curr = 0;
        int i = 0;
        int j = 0;
        int res = 0;
        while(j<nums.length){
            if(nums[j]==0) curr++;
            while(curr>k){
                if(nums[i]==0) curr--;
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}