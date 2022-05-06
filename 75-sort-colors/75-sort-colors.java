class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i:nums){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero!=0){
                nums[i] = 0;
                zero--;
            }
            else if(zero==0 && one!=zero){
                nums[i] = 1;
                one--;
            }
            else if(zero==0 && one==0 && two!=zero){
                nums[i] = 2;
                two--;
            }
        }
    }
}