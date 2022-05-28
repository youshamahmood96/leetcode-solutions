class Solution {
    public static int findIndex(int arr[], int t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            res[i] = nums[i];
            min = Math.min(min,res[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>min){
                int minIdx = findIndex(res,min);
                min = nums[i];
                while(minIdx<res.length-1){
                    res[minIdx] = res[minIdx+1];
                    minIdx++;
                }
                res[res.length-1] = nums[i];
                int j=0;
                while(j<res.length){
                    min = Math.min(res[j],min);
                    j++;
                }
            }
        }
        return res;
    }
}