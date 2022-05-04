class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<3) return res;
        int i=0;
        while(i<nums.length-2){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int target = 0-nums[i];
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    if(nums[j]+nums[k]<target){
                        j++;
                    }
                    else if(nums[j]+nums[k]>target){
                        k--;
                    }
                    else{
                        List<Integer> num = new ArrayList();
                        num.add(nums[i]);
                        num.add(nums[j]);
                        num.add(nums[k]);
                        res.add(num);
                         while (j < k && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;
                        k--;
                    }
                }
                i++;
            }
            else{
                i++;
            }
        }
        return res;
    }
}