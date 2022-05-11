class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}