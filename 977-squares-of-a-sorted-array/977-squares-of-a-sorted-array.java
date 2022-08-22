class Solution {
    public int[] sortedSquares(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]*nums[i]);
        }
        int i = 0;
        while(!q.isEmpty()){
            res[i] = q.poll();
            i++;
        }
        return res;
    }
}