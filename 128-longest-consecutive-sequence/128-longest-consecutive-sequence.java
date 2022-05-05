class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
               int currSeq = 1;
               while(set.contains(nums[i]+currSeq)){
                   currSeq++;
               }
               res = Math.max(currSeq,res);
            }
        }
        return res;
    }
}