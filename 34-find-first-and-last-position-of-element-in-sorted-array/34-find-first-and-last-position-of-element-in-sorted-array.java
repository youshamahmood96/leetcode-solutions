class Solution {
    public int left(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        int res = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target) hi = mid - 1;
            else if(nums[mid]<target) lo = mid + 1;
            else{
                res = mid;
                hi = mid - 1;
            }
        }
        return res;
    }
    public int right(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        int res = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target) hi = mid - 1;
            else if(nums[mid]<target) lo = mid + 1;
            else{
                res = mid;
                lo = mid + 1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = left(nums,target);
        res[1] = right(nums,target);
        return res;
    }
}