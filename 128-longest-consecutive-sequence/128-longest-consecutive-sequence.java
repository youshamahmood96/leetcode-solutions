class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        int maxSeq = 0;
        int currSeq = 0;
        for(int i:nums){
           if(!set.contains(i-1)){
               while(set.contains(i+currSeq)){
                   currSeq++;
               }
               maxSeq = Math.max(currSeq,maxSeq);
               currSeq = 0;
           }
        }
        return maxSeq;
    }
}