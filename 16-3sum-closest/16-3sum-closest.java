class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int currTarget = target-curr;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                int tot = nums[i]+nums[j]+nums[k];
                if(diff>(Math.abs(tot-target))){
                    res = tot;
                    diff = Math.abs(tot-target);
                }
                if(sum<currTarget) j++;
                else k--;
            }
        }
        return res;
    }
}