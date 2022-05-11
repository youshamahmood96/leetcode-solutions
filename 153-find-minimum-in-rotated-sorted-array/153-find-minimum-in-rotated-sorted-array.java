class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[right]) left = mid+1;
            else if(nums[mid]<nums[right]) right = mid-1;
            else{
                left++;
                right--;
            }
            res = Math.min(res,nums[mid]);
        }
        return res;
    }
}