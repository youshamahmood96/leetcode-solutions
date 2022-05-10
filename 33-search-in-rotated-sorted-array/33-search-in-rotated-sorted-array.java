class Solution {
    public int search(int[] nums, int target) {
        int pv = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                pv = i;
                break;
            }
        }
        int left = 0;
        int right = pv - 1;
        if(nums[pv]<=target && nums[nums.length-1]>=target){
            left = pv;
            right = nums.length-1;
        }
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]<target) left = mid+1;
            else if(nums[mid]>target) right = mid-1;
            else return mid;
        }
        return -1;
    }
}