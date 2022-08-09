class Solution {
    public long countBadPairs(int[] nums) {
        long res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            nums[i] = i - nums[i];
        }
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int i=0;i<nums.length;i++){
            int j = nums[i];
            int curr = map.get(j);
            if(curr>0) curr--;
            res += nums.length-i-1-curr;
            map.put(j,curr);
        }
        return res;
    }
}